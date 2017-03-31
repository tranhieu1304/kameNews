
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mac_thieu/git/feedpicks/conf/routes
// @DATE:Fri Mar 31 15:30:55 JST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
