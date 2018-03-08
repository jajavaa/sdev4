
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_E_DRIVE/sdev4/project/conf/routes
// @DATE:Thu Mar 08 16:48:56 GMT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:1
package controllers {

  // @LINE:3
  class ReverseProjectController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def delete(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:4
    def project(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:3
    def projects(project:String = "0"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "projects" + play.core.routing.queryString(List(if(project == "0") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("project", project)))))
    }
  
  }

  // @LINE:2
  class ReverseDepartmentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def departments(department:String = "0"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "departments" + play.core.routing.queryString(List(if(department == "0") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("department", department)))))
    }
  
  }

  // @LINE:1
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def index(department:String = "0"): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(if(department == "0") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("department", department)))))
    }
  
  }

  // @LINE:7
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def loginSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:7
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:5
  class ReverseEmployeeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def employee(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }


}
