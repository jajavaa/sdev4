package controllers;

import models.users.Employee;
import play.mvc.*;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import models.users.Admin;
import models.users.User;

class Auth {

    static class AuthAdmin extends Action.Simple {
        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
            String email = ctx.session().get("email");
            if (email != null) {
                User user = Admin.getWithEmail(email);
                if (user.getClass().equals(Admin.class)) {
                    return delegate.call(ctx);
                } else return CompletableFuture.completedFuture(forbidden("HTTP 403: Forbidden"));
            }
            return CompletableFuture.completedFuture(badRequest("HTTP 400: Bad Request"));
        }
    }

    static class AuthEmployee extends Action.Simple {

        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
            String email = ctx.session().get("email");
            if (email != null) {
                User user = Employee.getWithEmail(email);
                if(user.getClass().equals(Employee.class)) {
                    return delegate.call(ctx);
                } else return CompletableFuture.completedFuture(forbidden("HTTP 403: Forbidden"));
            }
            return CompletableFuture.completedFuture(badRequest("HTTP 400: Bad Request"));
        }
    }
}

