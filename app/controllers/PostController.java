/**
 *
 */
package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.avaje.ebean.PagedList;

import helpers.Secured;
import models.Comment;
import models.Post;
import models.User;
import play.api.Logger;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;
import util.URLGetTitle;

/**
 * @author mac_thieu
 *
 */
@Security.Authenticated(Secured.class)
public class PostController extends Controller {

	@Inject
	FormFactory formFactory;

	public Result showAllPost(int page) {
		// ctx().changeLang("es");
		PagedList<Post> pageList = Post.getPageList(page);
		List<Post> posts = pageList.getList();
		int maxPage = pageList.getTotalPageCount();
		// FOr test

		return ok(views.html.Post.showPostList.render(posts, page, maxPage));
	}

	public Result addPost(int page) {
		Http.Request request = Http.Context.current().request();
		String userName = request.username();
		User user = User.findByEmail(userName);
		Form<Post> form = formFactory.form(Post.class);
		PagedList<Post> pageList = Post.findByUser(user, page);
		int maxPage = pageList.getTotalPageCount();
		List<Post> posts = pageList.getList();
		return ok(views.html.Post.createNewPost.render(form, posts, new ArrayList<String>(), page,
			maxPage, new Post()));
	}


	public Result createPost(int page) {
		// This request send one more time to server >>> let fix it
		Http.Request request = Http.Context.current().request();
		String userName = request.username();
		User user = User.findByEmail(userName);
		PagedList<Post> pageList = Post.findByUser(user, 1);
		PagedList<Post> pageListTem = Post.findByUser(user, 1);
		int maxPage = pageList.getTotalPageCount();

		Form<Post> form = formFactory.form(Post.class).bindFromRequest();
		play.Logger.info("Post kame = " + form.get().kame);
		play.Logger.info("Comment kame = " + form.get().user.kame);
		Post post = new Post();
		if (!form.hasErrors()) {
			post = form.get();
			post.user = user;
			if (post.url.isEmpty()) {
				post.messageError.add("URLを入力してください。");
			} else
				try {
					if (isExistUrl(post.url)) {
						post.messageError.add("URLがありますが、他のURLを入力してください。");
					}
					post.title = URLGetTitle.getTitle(post.url);
					post.imgUrl = URLGetTitle.getImageUrl(post.url, "");
				} catch (IOException e) {
					e.printStackTrace();
					post.messageError.add("正しいURLを入力してください。");
				} catch (Exception e) {
					post.messageError.add("正しいURLを入力してください。");
				}
			if (post.messageError.isEmpty()) {
				post.save();
				play.Logger.info("-----------" + post.id);
				play.Logger.error("---IDDDDD-------" + post.id);
				form = formFactory.form(Post.class);

			}

		} else {
			play.Logger.error("------Error----" + form.errors());
			return badRequest("Have some error");
		}
		List<Post> posts = pageList.getList();
		return ok(views.html.Post.createNewPost.render(form, posts, post.messageError, page,
			maxPage, new Post()));
	}

	public Result viewPostDetail(Long postId) {
		Post post = Post.findById(postId);
		Form<Comment> formComment = formFactory.form(Comment.class);
		return ok(views.html.Post.postDetail.render(post, formComment));
	}

	private boolean isExistUrl(String url) {
		List<Post> posts = Post.findByUrl(url);
		// if (posts.isEmpty())
		// return false;
		// else
		return false;
	}

	public Result findPost(int page) {
		Form<FindForm> form = formFactory.form(FindForm.class).bindFromRequest();
		PagedList<Post> pageList;
		int maxPage = 0;
		List<Post> posts = new ArrayList<>();

		if (!form.hasErrors()) {
			String keyword = form.get().keyword;
			if ("".equals(keyword) || keyword == null) {
				pageList = Post.findAll(page);
			} else {
				pageList = Post.findTitle(keyword, page);
			}
			posts = pageList.getList();
			maxPage = pageList.getTotalPageCount();
		}
		return ok(views.html.Post.findPost.render(posts, form, page, maxPage));
	}

	public static class FindForm {
		public String keyword;
	}

	public Result deletePost(long postId) {
		Post.delete(postId);
		return showAllPost(1);
	}

	public Result findByPostIdCommentStatus(String categoryId1, String categoryId2) {
		Post.findBy2CAtegory(categoryId1, categoryId2);
		return showAllPost(1);
	}


}
