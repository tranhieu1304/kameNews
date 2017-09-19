package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.avaje.ebean.Expr;
import com.avaje.ebean.Expression;
import com.avaje.ebean.Model;
import com.avaje.ebean.PagedList;
import com.avaje.ebean.annotation.CreatedTimestamp;

import constants.Constant;
import play.Logger;

@Entity
@Table(name = "post")
public class Post extends Model {

	@Id
	@GeneratedValue
	public long id;

	@Column(name = "url", nullable = false, length = 255)
	public String url;

	@Column(name = "title", length = 255)
	public String title;

	@Column(name = "kame", length = 255)
	private String kame;

	@Column(name = "imgUrl", length = 255)
	public String imgUrl;

	@Column(name = "content")
	public String content;

	@Column(name = "createDate")
	@CreatedTimestamp
	public Date createDate;

	@Column(name = "isDelete")
	public boolean isDelete;

	@Transient
	public List<String> messageError = new ArrayList<>();
	// Relationship
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
	public User user;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
	public List<Comment> comments;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
	public List<Favorite> favorites;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "posts")
	public List<Category> categories;

	public static Finder<Long, Post> find = new Finder<>(Post.class);
	// public static Finder<String, Post> finder = new Finder<>("kame", Post.class);
	public static int pageSize = Constant.PAGINATION_PAGE_SIZE;

	public static PagedList<Post> findAll(int page) {

		int pageIndex = page - 1;
		PagedList<Post> pagedList =
			find.where().eq("isDelete", false).findPagedList(pageIndex, pageSize);
		return pagedList;
	}

	public static PagedList<Post> findByUser(User user, int page) {
		int pageIndex = page - 1;
		PagedList<Post> pagedList =
			find.where().like("isDelete", "0").in("user", user).findPagedList(pageIndex, pageSize);
		return pagedList;
	}

	public static Post findById(Long id) {
		return find.where().eq("id", id).findUnique();
	}

	public static PagedList<Post> findTitle(String keyword, int page) {
		int pageIndex = page - 1;
		Expression tem = Expr.like("title", keyword);
		PagedList<Post> pagedList = find.where().add(tem).findPagedList(pageIndex, pageSize);
		return pagedList;
	}

	public static List<Post> findByUrl(String url) {
		List<Post> pagedList = find.where().like("url", "%" + url.trim() + "%").findList();
		return pagedList;
	}

	public static Post findByPostIdCommentStatus(Long postId) {
		Post post = find.select("*").fetch("comments").where().eq("comments.isDelete", true)
			.eq("id", postId).setMaxRows(1).findUnique();
		return post;
	}

	public static PagedList<Post> getPageList(int page) {
		int pageIndex = page - 1;
		PagedList<Post> pagedList =
			find.where().like("isDelete", "0").findPagedList(pageIndex, pageSize);
		return pagedList;
	}

	public static void findBy2CAtegory(String categoryId1, String categoryId2) {
		Category cat1 = Category.findById(categoryId1);
		Category cat2 = Category.findById(categoryId2);
		List<Category> catList = new ArrayList<>();
		List<String> catIdList = new ArrayList<>();
		catIdList.add(categoryId1);
		catIdList.add(categoryId2);
		catList.add(cat1);
		catList.add(cat2);
		Logger.error("cat1 = " + cat1.name);
		Logger.error("cat2 = " + cat2.name);
		List<Post> findList = find.where().eq("categories.id", categoryId1).findList().stream()
			.filter(post -> post.categories.contains(cat2)).collect(Collectors.toList());;
		// List<Post> findList = find.where().eq("categories.id", categoryId1).findList();
		Logger.error("--------------------------");
		for (Post item : findList) {
			Logger.error("Post = " + item.id);
		}
		// return find.where().and(Expr.eq("categories", cat1), Expr.eq("categories", cat2))
		// .findUnique();
	}

	public void deletePost() {
		this.isDelete = true;
		super.update();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public boolean isDelete() {
		return isDelete;
	}

	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}

	public List<String> getMessageError() {
		return messageError;
	}

	public void setMessageError(List<String> messageError) {
		this.messageError = messageError;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Favorite> getFavorites() {
		return favorites;
	}

	public void setFavorites(List<Favorite> favorites) {
		this.favorites = favorites;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public String getKame() {
		return kame;
	}

	public void setKame(String kame) {
		this.kame = kame;
	}



}
