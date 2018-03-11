
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/konrad/Documents/sdev4/project/conf/routes
// @DATE:Sun Mar 11 14:19:22 GMT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:1
package controllers {

  // @LINE:32
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def at(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:1
  class ReverseProjectController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def project(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:1
    def projects(): Call = {
    
      () match {
      
        // @LINE:1
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
    // @LINE:11
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/create/")
    }
  
    // @LINE:14
    def form(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "project/submit")
    }
  
    // @LINE:13
    def delete(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:12
    def update(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/update/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }

  // @LINE:2
  class ReverseDepartmentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "department/create/")
    }
  
    // @LINE:3
    def department(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "department/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:7
    def form(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "department/submit")
    }
  
    // @LINE:6
    def delete(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "department/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:5
    def update(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "department/update/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:2
    def departments(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "department/all")
    }
  
  }

  // @LINE:23
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:25
    def form(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login/submit")
    }
  
    // @LINE:23
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:16
  class ReverseEmployeeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employee/create/")
    }
  
    // @LINE:21
    def form(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "employee/submit")
    }
  
    // @LINE:16
    def employees(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employee/all")
    }
  
    // @LINE:20
    def delete(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employee/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:19
    def update(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employee/update/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:17
    def employee(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employee/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }

  // @LINE:27
  class ReverseAddressController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def delete(id:String, empl:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "address/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("empl", empl)))
    }
  
    // @LINE:30
    def form(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "address/submit")
    }
  
    // @LINE:28
    def update(id:String, empl:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "address/update/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("empl", empl)))
    }
  
    // @LINE:27
    def create(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "address/create/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }


}
