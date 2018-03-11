package models;

import io.ebean.Finder;
import io.ebean.Model;
import io.ebean.annotation.NotNull;
import models.users.Employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


@Entity
public class Department extends Model {

    @Id
    private String id;

    @NotNull
    private String title;

    @OneToMany
    @NotNull
    private List<Employee> employees;

    private static Finder<String, Department> find = new Finder<>(Department.class);

    public Department() {
    }

    public Department(String id, String title, List<Employee> employees) {
        this.id = id;
        this.title = title;
        this.employees = employees;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public static Finder<String, Department> getFind() {
        return find;
    }

    public static List<Department> getAll() {
        return Department.find.query().where().orderBy("title asc").findList();
    }

    public static Department get(String id) {
        return find.ref(id);
    }
}