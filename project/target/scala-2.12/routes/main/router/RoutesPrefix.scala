
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_E_DRIVE/sdev4/project/conf/routes
// @DATE:Fri Mar 09 18:11:15 GMT 2018


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
