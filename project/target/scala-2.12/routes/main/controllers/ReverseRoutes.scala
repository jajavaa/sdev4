
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_E_DRIVE/sdev4/project/conf/routes
// @DATE:Fri Mar 09 14:03:18 GMT 2018

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

  
    // @LINE:4
    def project(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:3
    def projects(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "projects")
    }
  
    // @LINE:5
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createProject")
    }
  
    // @LINE:13
    def form(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "projectSubmit")
    }
  
    // @LINE:8
    def delete(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:6
    def update(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateProject/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }

  // @LINE:2
  class ReverseDepartmentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def department(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "department/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:2
    def departments(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "departments")
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

  // @LINE:9
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def loginSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:11
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:9
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:7
  class ReverseEmployeeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def employee(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }


}
