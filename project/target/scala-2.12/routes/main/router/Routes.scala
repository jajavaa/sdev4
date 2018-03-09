
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_E_DRIVE/sdev4/project/conf/routes
// @DATE:Fri Mar 09 14:03:18 GMT 2018

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
  // @LINE:7
  EmployeeController_1: controllers.EmployeeController,
  // @LINE:9
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
    // @LINE:7
    EmployeeController_1: controllers.EmployeeController,
    // @LINE:9
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """departments""", """controllers.DepartmentController.departments"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects""", """controllers.ProjectController.projects"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/""" + "$" + """id<[^/]+>""", """controllers.ProjectController.project(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createProject""", """controllers.ProjectController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProject/""" + "$" + """id<[^/]+>""", """controllers.ProjectController.update(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.employee(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/delete/""" + "$" + """id<[^/]+>""", """controllers.ProjectController.delete(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """department/""" + "$" + """id<[^/]+>""", """controllers.DepartmentController.department(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projectSubmit""", """controllers.ProjectController.form"""),
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
    DepartmentController_3.departments,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DepartmentController",
      "departments",
      Nil,
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
    ProjectController_2.projects,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "projects",
      Nil,
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
  private[this] lazy val controllers_ProjectController_create4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createProject")))
  )
  private[this] lazy val controllers_ProjectController_create4_invoker = createInvoker(
    ProjectController_2.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "create",
      Nil,
      "GET",
      this.prefix + """createProject""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_ProjectController_update5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_update5_invoker = createInvoker(
    ProjectController_2.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "update",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateProject/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_EmployeeController_employee6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_employee6_invoker = createInvoker(
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

  // @LINE:8
  private[this] lazy val controllers_ProjectController_delete7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_delete7_invoker = createInvoker(
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

  // @LINE:9
  private[this] lazy val controllers_LoginController_login8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login8_invoker = createInvoker(
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

  // @LINE:10
  private[this] lazy val controllers_LoginController_loginSubmit9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit9_invoker = createInvoker(
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

  // @LINE:11
  private[this] lazy val controllers_LoginController_logout10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout10_invoker = createInvoker(
    LoginController_4.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_DepartmentController_department11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("department/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DepartmentController_department11_invoker = createInvoker(
    DepartmentController_3.department(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DepartmentController",
      "department",
      Seq(classOf[String]),
      "GET",
      this.prefix + """department/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ProjectController_form12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projectSubmit")))
  )
  private[this] lazy val controllers_ProjectController_form12_invoker = createInvoker(
    ProjectController_2.form,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "form",
      Nil,
      "POST",
      this.prefix + """projectSubmit""",
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
      call { 
        controllers_DepartmentController_departments1_invoker.call(DepartmentController_3.departments)
      }
  
    // @LINE:3
    case controllers_ProjectController_projects2_route(params@_) =>
      call { 
        controllers_ProjectController_projects2_invoker.call(ProjectController_2.projects)
      }
  
    // @LINE:4
    case controllers_ProjectController_project3_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ProjectController_project3_invoker.call(ProjectController_2.project(id))
      }
  
    // @LINE:5
    case controllers_ProjectController_create4_route(params@_) =>
      call { 
        controllers_ProjectController_create4_invoker.call(ProjectController_2.create)
      }
  
    // @LINE:6
    case controllers_ProjectController_update5_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ProjectController_update5_invoker.call(ProjectController_2.update(id))
      }
  
    // @LINE:7
    case controllers_EmployeeController_employee6_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_EmployeeController_employee6_invoker.call(EmployeeController_1.employee(id))
      }
  
    // @LINE:8
    case controllers_ProjectController_delete7_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ProjectController_delete7_invoker.call(ProjectController_2.delete(id))
      }
  
    // @LINE:9
    case controllers_LoginController_login8_route(params@_) =>
      call { 
        controllers_LoginController_login8_invoker.call(LoginController_4.login)
      }
  
    // @LINE:10
    case controllers_LoginController_loginSubmit9_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit9_invoker.call(LoginController_4.loginSubmit)
      }
  
    // @LINE:11
    case controllers_LoginController_logout10_route(params@_) =>
      call { 
        controllers_LoginController_logout10_invoker.call(LoginController_4.logout)
      }
  
    // @LINE:12
    case controllers_DepartmentController_department11_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_DepartmentController_department11_invoker.call(DepartmentController_3.department(id))
      }
  
    // @LINE:13
    case controllers_ProjectController_form12_route(params@_) =>
      call { 
        controllers_ProjectController_form12_invoker.call(ProjectController_2.form)
      }
  }
}
