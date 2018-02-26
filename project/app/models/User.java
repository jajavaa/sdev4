package models;

import io.ebean.Finder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private String email;
    private String password;
    private String role;

    private static Finder<String, User> finder = new Finder<>(User.class);

    public User() {}

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public static User find(String email) {
        return finder.byId(email);
    }

    public static User authenticate(String email, String password) {
        return finder.query().where().eq("email", email).eq("password", password).findUnique();
    }
}
