
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/konrad/Documents/sdev4/project/conf/routes
// @DATE:Sun Mar 11 14:19:22 GMT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  ProjectController_2: controllers.ProjectController,
  // @LINE:2
  DepartmentController_3: controllers.DepartmentController,
  // @LINE:16
  EmployeeController_1: controllers.EmployeeController,
  // @LINE:23
  LoginController_5: controllers.LoginController,
  // @LINE:27
  AddressController_0: controllers.AddressController,
  // @LINE:32
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    ProjectController_2: controllers.ProjectController,
    // @LINE:2
    DepartmentController_3: controllers.DepartmentController,
    // @LINE:16
    EmployeeController_1: controllers.EmployeeController,
    // @LINE:23
    LoginController_5: controllers.LoginController,
    // @LINE:27
    AddressController_0: controllers.AddressController,
    // @LINE:32
    Assets_4: controllers.Assets
  ) = this(errorHandler, ProjectController_2, DepartmentController_3, EmployeeController_1, LoginController_5, AddressController_0, Assets_4, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProjectController_2, DepartmentController_3, EmployeeController_1, LoginController_5, AddressController_0, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ProjectController.projects"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """department/all""", """controllers.DepartmentController.departments"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """department/""" + "$" + """id<[^/]+>""", """controllers.DepartmentController.department(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """department/create/""", """controllers.DepartmentController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """department/update/""" + "$" + """id<[^/]+>""", """controllers.DepartmentController.update(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """department/delete/""" + "$" + """id<[^/]+>""", """controllers.DepartmentController.delete(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """department/submit""", """controllers.DepartmentController.form"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/all""", """controllers.ProjectController.projects"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/""" + "$" + """id<[^/]+>""", """controllers.ProjectController.project(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/create/""", """controllers.ProjectController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/update/""" + "$" + """id<[^/]+>""", """controllers.ProjectController.update(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/delete/""" + "$" + """id<[^/]+>""", """controllers.ProjectController.delete(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/submit""", """controllers.ProjectController.form"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/all""", """controllers.EmployeeController.employees"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.employee(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/create/""", """controllers.EmployeeController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/update/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.update(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/delete/""" + "$" + """id<[^/]+>""", """controllers.EmployeeController.delete(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee/submit""", """controllers.EmployeeController.form"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/submit""", """controllers.LoginController.form"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """address/create/""" + "$" + """id<[^/]+>""", """controllers.AddressController.create(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """address/update/""" + "$" + """id<[^/]+>/""" + "$" + """empl<[^/]+>""", """controllers.AddressController.update(id:String, empl:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """address/delete/""" + "$" + """id<[^/]+>/""" + "$" + """empl<[^/]+>""", """controllers.AddressController.delete(id:String, empl:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """address/submit""", """controllers.AddressController.form"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_ProjectController_projects0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ProjectController_projects0_invoker = createInvoker(
    ProjectController_2.projects,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "projects",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:2
  private[this] lazy val controllers_DepartmentController_departments1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("department/all")))
  )
  private[this] lazy val controllers_DepartmentController_departments1_invoker = createInvoker(
    DepartmentController_3.departments,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DepartmentController",
      "departments",
      Nil,
      "GET",
      this.prefix + """department/all""",
      """""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_DepartmentController_department2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("department/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DepartmentController_department2_invoker = createInvoker(
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

  // @LINE:4
  private[this] lazy val controllers_DepartmentController_create3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("department/create/")))
  )
  private[this] lazy val controllers_DepartmentController_create3_invoker = createInvoker(
    DepartmentController_3.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DepartmentController",
      "create",
      Nil,
      "GET",
      this.prefix + """department/create/""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_DepartmentController_update4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("department/update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DepartmentController_update4_invoker = createInvoker(
    DepartmentController_3.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DepartmentController",
      "update",
      Seq(classOf[String]),
      "GET",
      this.prefix + """department/update/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_DepartmentController_delete5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("department/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DepartmentController_delete5_invoker = createInvoker(
    DepartmentController_3.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DepartmentController",
      "delete",
      Seq(classOf[String]),
      "GET",
      this.prefix + """department/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_DepartmentController_form6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("department/submit")))
  )
  private[this] lazy val controllers_DepartmentController_form6_invoker = createInvoker(
    DepartmentController_3.form,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DepartmentController",
      "form",
      Nil,
      "POST",
      this.prefix + """department/submit""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ProjectController_projects7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/all")))
  )
  private[this] lazy val controllers_ProjectController_projects7_invoker = createInvoker(
    ProjectController_2.projects,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "projects",
      Nil,
      "GET",
      this.prefix + """project/all""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ProjectController_project8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_project8_invoker = createInvoker(
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

  // @LINE:11
  private[this] lazy val controllers_ProjectController_create9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/create/")))
  )
  private[this] lazy val controllers_ProjectController_create9_invoker = createInvoker(
    ProjectController_2.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "create",
      Nil,
      "GET",
      this.prefix + """project/create/""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ProjectController_update10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_update10_invoker = createInvoker(
    ProjectController_2.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "update",
      Seq(classOf[String]),
      "GET",
      this.prefix + """project/update/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ProjectController_delete11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_delete11_invoker = createInvoker(
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

  // @LINE:14
  private[this] lazy val controllers_ProjectController_form12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/submit")))
  )
  private[this] lazy val controllers_ProjectController_form12_invoker = createInvoker(
    ProjectController_2.form,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "form",
      Nil,
      "POST",
      this.prefix + """project/submit""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_EmployeeController_employees13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/all")))
  )
  private[this] lazy val controllers_EmployeeController_employees13_invoker = createInvoker(
    EmployeeController_1.employees,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "employees",
      Nil,
      "GET",
      this.prefix + """employee/all""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_EmployeeController_employee14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_employee14_invoker = createInvoker(
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

  // @LINE:18
  private[this] lazy val controllers_EmployeeController_create15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/create/")))
  )
  private[this] lazy val controllers_EmployeeController_create15_invoker = createInvoker(
    EmployeeController_1.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "create",
      Nil,
      "GET",
      this.prefix + """employee/create/""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_EmployeeController_update16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_update16_invoker = createInvoker(
    EmployeeController_1.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "update",
      Seq(classOf[String]),
      "GET",
      this.prefix + """employee/update/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_EmployeeController_delete17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeController_delete17_invoker = createInvoker(
    EmployeeController_1.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "delete",
      Seq(classOf[String]),
      "GET",
      this.prefix + """employee/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_EmployeeController_form18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee/submit")))
  )
  private[this] lazy val controllers_EmployeeController_form18_invoker = createInvoker(
    EmployeeController_1.form,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "form",
      Nil,
      "POST",
      this.prefix + """employee/submit""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_LoginController_login19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login19_invoker = createInvoker(
    LoginController_5.login,
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

  // @LINE:24
  private[this] lazy val controllers_LoginController_logout20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout20_invoker = createInvoker(
    LoginController_5.logout,
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

  // @LINE:25
  private[this] lazy val controllers_LoginController_form21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/submit")))
  )
  private[this] lazy val controllers_LoginController_form21_invoker = createInvoker(
    LoginController_5.form,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "form",
      Nil,
      "POST",
      this.prefix + """login/submit""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_AddressController_create22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("address/create/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AddressController_create22_invoker = createInvoker(
    AddressController_0.create(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "create",
      Seq(classOf[String]),
      "GET",
      this.prefix + """address/create/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_AddressController_update23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("address/update/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("empl", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AddressController_update23_invoker = createInvoker(
    AddressController_0.update(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "update",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """address/update/""" + "$" + """id<[^/]+>/""" + "$" + """empl<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_AddressController_delete24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("address/delete/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("empl", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AddressController_delete24_invoker = createInvoker(
    AddressController_0.delete(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "delete",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """address/delete/""" + "$" + """id<[^/]+>/""" + "$" + """empl<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_AddressController_form25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("address/submit")))
  )
  private[this] lazy val controllers_AddressController_form25_invoker = createInvoker(
    AddressController_0.form,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "form",
      Nil,
      "POST",
      this.prefix + """address/submit""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Assets_at26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at26_invoker = createInvoker(
    Assets_4.at(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_ProjectController_projects0_route(params@_) =>
      call { 
        controllers_ProjectController_projects0_invoker.call(ProjectController_2.projects)
      }
  
    // @LINE:2
    case controllers_DepartmentController_departments1_route(params@_) =>
      call { 
        controllers_DepartmentController_departments1_invoker.call(DepartmentController_3.departments)
      }
  
    // @LINE:3
    case controllers_DepartmentController_department2_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_DepartmentController_department2_invoker.call(DepartmentController_3.department(id))
      }
  
    // @LINE:4
    case controllers_DepartmentController_create3_route(params@_) =>
      call { 
        controllers_DepartmentController_create3_invoker.call(DepartmentController_3.create)
      }
  
    // @LINE:5
    case controllers_DepartmentController_update4_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_DepartmentController_update4_invoker.call(DepartmentController_3.update(id))
      }
  
    // @LINE:6
    case controllers_DepartmentController_delete5_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_DepartmentController_delete5_invoker.call(DepartmentController_3.delete(id))
      }
  
    // @LINE:7
    case controllers_DepartmentController_form6_route(params@_) =>
      call { 
        controllers_DepartmentController_form6_invoker.call(DepartmentController_3.form)
      }
  
    // @LINE:9
    case controllers_ProjectController_projects7_route(params@_) =>
      call { 
        controllers_ProjectController_projects7_invoker.call(ProjectController_2.projects)
      }
  
    // @LINE:10
    case controllers_ProjectController_project8_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ProjectController_project8_invoker.call(ProjectController_2.project(id))
      }
  
    // @LINE:11
    case controllers_ProjectController_create9_route(params@_) =>
      call { 
        controllers_ProjectController_create9_invoker.call(ProjectController_2.create)
      }
  
    // @LINE:12
    case controllers_ProjectController_update10_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ProjectController_update10_invoker.call(ProjectController_2.update(id))
      }
  
    // @LINE:13
    case controllers_ProjectController_delete11_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ProjectController_delete11_invoker.call(ProjectController_2.delete(id))
      }
  
    // @LINE:14
    case controllers_ProjectController_form12_route(params@_) =>
      call { 
        controllers_ProjectController_form12_invoker.call(ProjectController_2.form)
      }
  
    // @LINE:16
    case controllers_EmployeeController_employees13_route(params@_) =>
      call { 
        controllers_EmployeeController_employees13_invoker.call(EmployeeController_1.employees)
      }
  
    // @LINE:17
    case controllers_EmployeeController_employee14_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_EmployeeController_employee14_invoker.call(EmployeeController_1.employee(id))
      }
  
    // @LINE:18
    case controllers_EmployeeController_create15_route(params@_) =>
      call { 
        controllers_EmployeeController_create15_invoker.call(EmployeeController_1.create)
      }
  
    // @LINE:19
    case controllers_EmployeeController_update16_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_EmployeeController_update16_invoker.call(EmployeeController_1.update(id))
      }
  
    // @LINE:20
    case controllers_EmployeeController_delete17_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_EmployeeController_delete17_invoker.call(EmployeeController_1.delete(id))
      }
  
    // @LINE:21
    case controllers_EmployeeController_form18_route(params@_) =>
      call { 
        controllers_EmployeeController_form18_invoker.call(EmployeeController_1.form)
      }
  
    // @LINE:23
    case controllers_LoginController_login19_route(params@_) =>
      call { 
        controllers_LoginController_login19_invoker.call(LoginController_5.login)
      }
  
    // @LINE:24
    case controllers_LoginController_logout20_route(params@_) =>
      call { 
        controllers_LoginController_logout20_invoker.call(LoginController_5.logout)
      }
  
    // @LINE:25
    case controllers_LoginController_form21_route(params@_) =>
      call { 
        controllers_LoginController_form21_invoker.call(LoginController_5.form)
      }
  
    // @LINE:27
    case controllers_AddressController_create22_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_AddressController_create22_invoker.call(AddressController_0.create(id))
      }
  
    // @LINE:28
    case controllers_AddressController_update23_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromPath[String]("empl", None)) { (id, empl) =>
        controllers_AddressController_update23_invoker.call(AddressController_0.update(id, empl))
      }
  
    // @LINE:29
    case controllers_AddressController_delete24_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromPath[String]("empl", None)) { (id, empl) =>
        controllers_AddressController_delete24_invoker.call(AddressController_0.delete(id, empl))
      }
  
    // @LINE:30
    case controllers_AddressController_form25_route(params@_) =>
      call { 
        controllers_AddressController_form25_invoker.call(AddressController_0.form)
      }
  
    // @LINE:32
    case controllers_Assets_at26_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_at26_invoker.call(Assets_4.at(file))
      }
  }
}
