
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mac_thieu/git/feedpicks/conf/routes
// @DATE:Fri Mar 31 15:30:55 JST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLanguage Language = new controllers.ReverseLanguage(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseFavoriteController FavoriteController = new controllers.ReverseFavoriteController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAuthController AuthController = new controllers.ReverseAuthController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePostController PostController = new controllers.ReversePostController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDataTableTemplate DataTableTemplate = new controllers.ReverseDataTableTemplate(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCommentController CommentController = new controllers.ReverseCommentController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLanguage Language = new controllers.javascript.ReverseLanguage(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseFavoriteController FavoriteController = new controllers.javascript.ReverseFavoriteController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAuthController AuthController = new controllers.javascript.ReverseAuthController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePostController PostController = new controllers.javascript.ReversePostController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDataTableTemplate DataTableTemplate = new controllers.javascript.ReverseDataTableTemplate(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCommentController CommentController = new controllers.javascript.ReverseCommentController(RoutesPrefix.byNamePrefix());
  }

}
