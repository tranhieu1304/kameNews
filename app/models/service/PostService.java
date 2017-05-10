/**
 * 
 */
package models.service;

import java.util.List;

import com.avaje.ebean.Model.Finder;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.PagedList;

import constants.Constant;
import models.Post;
import models.User;

/**
 * @author mac_thieu
 *
 */
public class PostService {

	private Finder<Long, Post> find = new Finder<>(Post.class);
	private Finder<Long, Post> finder = new Finder<>("kame", Post.class);

	private static int pageSize = Constant.PAGINATION_PAGE_SIZE;

	public PagedList<Post> findAll(int page) {

		int pageIndex = page - 1;
		PagedList<Post> pagedList =
			find.where().eq("isDelete", false).findPagedList(pageIndex, pageSize);
		return pagedList;
	}

	public PagedList<Post> findByUser(User user, int page) {
		int pageIndex = page - 1;
		PagedList<Post> pagedList =
			find.where().like("isDelete", "0").in("user", user).findPagedList(pageIndex, pageSize);
		return pagedList;
	}

	public Post findById(Long id) {
		return find.where().eq("id", id).findUnique();
	}

	public PagedList<Post> findTitle(String keyword, int page) {
		int pageIndex = page - 1;
		PagedList<Post> pagedList =
			find.where().like("title", "%" + keyword + "%").findPagedList(pageIndex, pageSize);
		return pagedList;
	}

	public List<Post> findByUrl(String url) {
		List<Post> pagedList = find.where().like("url", "%" + url.trim() + "%").findList();
		return pagedList;
	}

	public Post findByPostIdCommentStatus(Long postId) {
		Post post = find.select("*").fetch("comments").where().eq("comments.isDelete", true)
			.eq("id", postId).setMaxRows(1).findUnique();
		return post;
	}

	public PagedList<Post> getPageList(int page) {
		int pageIndex = page - 1;
		PagedList<Post> pagedList =
			finder.where().like("isDelete", "0").findPagedList(pageIndex, pageSize);

		return pagedList;
	}

	private EbeanServer db(String server) {
		return Ebean.getServer(server);
	}

	public void save(Post post) {
		db("kame").save(post);
	}

}
