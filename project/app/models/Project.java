package models;

import io.ebean.Finder;
import io.ebean.Model;
import models.users.Employee;
import org.joda.time.DateTime;
import javax.persistence.*;
import java.util.List;

@Entity

public class Project extends Model {

    @Id
    private String id;
    private String name;
    private DateTime start;
    private DateTime end;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Employee> employees;

    private static final Finder<String, Project> finder = new Finder<>(Project.class);

    public Project() {
    }

    public Project(String id, String name, DateTime start, DateTime end, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.start = start;
        this.end = end;
        this.employees = employees;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateTime getStart() {
        return start;
    }

    public void setStart(DateTime start) {
        this.start = start;
    }

    public DateTime getEnd() {
        return end;
    }

    public void setEnd(DateTime end) {
        this.end = end;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public static Finder<String, Project> getFinder() {
        return finder;
    }

    public static List<Project> getAll() {
        return Project.finder.all();
    }

    public static Project get(String id) {
        return finder.ref(id);
    }
}