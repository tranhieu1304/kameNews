
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mac_thieu/git/feedpicks/conf/routes
// @DATE:Fri Mar 31 15:30:55 JST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:3
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:43
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:39
  class ReverseLanguage(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def changeLanguageHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Language.changeLanguageHome",
      """
        function(code0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "language/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("code", encodeURIComponent(code0)) + "/"})
        }
      """
    )
  
    // @LINE:39
    def changeLanguage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Language.changeLanguage",
      """
        function(code0,returnpath1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "language/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("code", encodeURIComponent(code0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("returnpath", returnpath1)})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def editUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.editUser",
      """
        function(userName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editUser/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userName", encodeURIComponent(userName0))})
        }
      """
    )
  
    // @LINE:27
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.update",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "update/"})
        }
      """
    )
  
    // @LINE:25
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createUser"})
        }
      """
    )
  
    // @LINE:24
    def add: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.add",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addUser"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseFavoriteController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def favoriedPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FavoriteController.favoriedPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "listPost/like"})
        }
      """
    )
  
  }

  // @LINE:3
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseAuthController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:35
    def auth: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.auth",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "auth"})
        }
      """
    )
  
    // @LINE:34
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReversePostController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def findPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.findPost",
      """
        function(page0) {
        
          if (page0 == """ + implicitly[JavascriptLiteral[Integer]].to(1) + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "find/"})
          }
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "find/index/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("page", page0)})
          }
        
        }
      """
    )
  
    // @LINE:14
    def viewPostDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.viewPostDetail",
      """
        function(postId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "detailPost/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("postId", postId0)})
        }
      """
    )
  
    // @LINE:11
    def createPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.createPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createPost"})
        }
      """
    )
  
    // @LINE:9
    def addPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.addPost",
      """
        function(page0) {
        
          if (page0 == """ + implicitly[JavascriptLiteral[Integer]].to(1) + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addPost"})
          }
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addPost/index/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("page", page0)})
          }
        
        }
      """
    )
  
    // @LINE:6
    def showAllPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.showAllPost",
      """
        function(page0) {
        
          if (page0 == """ + implicitly[JavascriptLiteral[Integer]].to(1) + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listPost/index"})
          }
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listPost/index/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("page", page0)})
          }
        
        }
      """
    )
  
  }

  // @LINE:30
  class ReverseDataTableTemplate(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DataTableTemplate.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dataTable"})
        }
      """
    )
  
    // @LINE:30
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DataTableTemplate.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kamedb"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseCommentController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def createComment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommentController.createComment",
      """
        function(postId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addComment/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("postId", postId0)})
        }
      """
    )
  
  }


}
