
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_E_DRIVE/sdev4/project/conf/routes
// @DATE:Fri Mar 09 14:03:18 GMT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseProjectController ProjectController = new controllers.ReverseProjectController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseDepartmentController DepartmentController = new controllers.ReverseDepartmentController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLoginController LoginController = new controllers.ReverseLoginController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseEmployeeController EmployeeController = new controllers.ReverseEmployeeController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseProjectController ProjectController = new controllers.javascript.ReverseProjectController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseDepartmentController DepartmentController = new controllers.javascript.ReverseDepartmentController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLoginController LoginController = new controllers.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseEmployeeController EmployeeController = new controllers.javascript.ReverseEmployeeController(RoutesPrefix.byNamePrefix());
  }

}
