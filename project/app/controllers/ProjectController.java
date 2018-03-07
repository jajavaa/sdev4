package controllers;

import models.Project;
import models.users.User;
import play.data.Form;
import play.db.ebean.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import play.mvc.With;
import views.html.projects;
import views.html.project;

public class ProjectController extends Controller{

//    @Security.Authenticated(Secured.class)
//    @With(AuthAdmin.class)
//    @Transactional
//    public Result createProject() {
//        Form<Project> customerForm = formFactory.form(Project.class);
//        return ok(addProject.render(customerForm, User.find(session().get("email"))));
//    }

    public Result projects(String id) {
        return ok(projects.render(Project.findAll(), Project.getFinder().ref(id), User.get(session().get("email"))));
    }

    public Result project(String id) {
        return ok(project.render(Project.getFinder().ref(id), User.get(session().get("email"))));
    }

//    @Transactional
//    public Result updateProject(Long id) {
//        Project project;
//        Form<Project> form;
//
//        try {
//            project = Project.find.byId(id);
//            assert project != null;
//            form = formFactory.form(Project.class).fill(project);
//        } catch (Exception ex) {
//            return badRequest("<h1>400 Bad Request</h1>");
//        }
//
//        return ok(addCustomer.render(form, User.getUserById(session().get("email"))));
//    }

    public Result delete(String id) {
        Project.getFinder().ref(id).delete();
        flash("success", "Customer has been deleted");
        return redirect(routes.HomeController.index("0"));
    }

//    public Result projectForm() {
//        Form<Project> form = formFactory.form(Project.class).bindFromRequest();
//        if (!form.hasErrors()) {
//            Project project = form.get();
//            if (project.getId() == null) {
//                project.save();
//                flash("success", String.format("Project %s was added", project.getName()));
//            } else {
//                project.update();
//                flash("success", String.format("Project %s was updated", project.getName()));
//            }
//            return redirect(controllers.routes.HomeController.readProject());
//        } else {
//            return badRequest(addProject.render(form, User.find(session().get("email"))));
//        }
//    }
}
