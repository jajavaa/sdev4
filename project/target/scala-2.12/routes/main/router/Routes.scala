
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_E_DRIVE/sdev4/project/conf/routes
// @DATE:Thu Mar 08 16:48:56 GMT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  HomeController_0: controllers.HomeController,
  // @LINE:2
  DepartmentController_3: controllers.DepartmentController,
  // @LINE:3
  ProjectController_2: controllers.ProjectController,
  // @LINE:5
  EmployeeController_1: controllers.EmployeeController,
  // @LINE:7
  LoginController_4: controllers.LoginController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    HomeController_0: controllers.HomeController,
    // @LINE:2
    DepartmentController_3: controllers.DepartmentController,
    // @LINE:3
    ProjectController_2: controllers.ProjectController,
    // @LINE:5
    EmployeeController_1: controllers.EmployeeController,
    // @LINE:7
    LoginController_4: controllers.LoginController
  ) = this(errorHandler, HomeController_0, DepartmentController_3, ProjectController_2, EmployeeController_1, LoginController_4, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, DepartmentController_3, ProjectController_2, EmployeeController_1, LoginController_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index(department:String ?= "0")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """departments""", """controllers.DepartmentController.departments(department:String ?= "0")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects""", """controllers.ProjectController.projects(project:String ?= "0")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/""" + "$" + """id<[^/]+>""", """controllers.ProjectController.project(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.employee(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/delete/""" + "$" + """id<[^/]+>""", """controllers.ProjectController.delete(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[String]),
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:2
  private[this] lazy val controllers_DepartmentController_departments1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("departments")))
  )
  private[this] lazy val controllers_DepartmentController_departments1_invoker = createInvoker(
    DepartmentController_3.departments(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DepartmentController",
      "departments",
      Seq(classOf[String]),
      "GET",
      this.prefix + """departments""",
      """""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_ProjectController_projects2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects")))
  )
  private[this] lazy val controllers_ProjectController_projects2_invoker = createInvoker(
    ProjectController_2.projects(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "projects",
      Seq(classOf[String]),
      "GET",
      this.prefix + """projects""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val controllers_ProjectController_project3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_project3_invoker = createInvoker(
    ProjectController_2.project(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "project",
      Seq(classOf[String]),
      "GET",
      this.prefix + """project/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_EmployeeController_employee4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_employee4_invoker = createInvoker(
    EmployeeController_1.employee(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "employee",
      Seq(classOf[String]),
      "GET",
      this.prefix + """employee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_ProjectController_delete5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_delete5_invoker = createInvoker(
    ProjectController_2.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "delete",
      Seq(classOf[String]),
      "GET",
      this.prefix + """project/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_LoginController_login6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login6_invoker = createInvoker(
    LoginController_4.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_LoginController_loginSubmit7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit7_invoker = createInvoker(
    LoginController_4.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_HomeController_index0_route(params@_) =>
      call(params.fromQuery[String]("department", Some("0"))) { (department) =>
        controllers_HomeController_index0_invoker.call(HomeController_0.index(department))
      }
  
    // @LINE:2
    case controllers_DepartmentController_departments1_route(params@_) =>
      call(params.fromQuery[String]("department", Some("0"))) { (department) =>
        controllers_DepartmentController_departments1_invoker.call(DepartmentController_3.departments(department))
      }
  
    // @LINE:3
    case controllers_ProjectController_projects2_route(params@_) =>
      call(params.fromQuery[String]("project", Some("0"))) { (project) =>
        controllers_ProjectController_projects2_invoker.call(ProjectController_2.projects(project))
      }
  
    // @LINE:4
    case controllers_ProjectController_project3_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ProjectController_project3_invoker.call(ProjectController_2.project(id))
      }
  
    // @LINE:5
    case controllers_EmployeeController_employee4_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_EmployeeController_employee4_invoker.call(EmployeeController_1.employee(id))
      }
  
    // @LINE:6
    case controllers_ProjectController_delete5_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ProjectController_delete5_invoker.call(ProjectController_2.delete(id))
      }
  
    // @LINE:7
    case controllers_LoginController_login6_route(params@_) =>
      call { 
        controllers_LoginController_login6_invoker.call(LoginController_4.login)
      }
  
    // @LINE:8
    case controllers_LoginController_loginSubmit7_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit7_invoker.call(LoginController_4.loginSubmit)
      }
  }
}
