package models;

import io.ebean.Finder;
import io.ebean.Model;
import io.ebean.annotation.NotNull;
import models.users.Employee;
import org.joda.time.DateTime;
import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Entity
public class Project extends Model {

    @Id
    private String id;
    @Column(unique = true)
    @NotNull
    private String name;
    @NotNull
    private Date start;
    @NotNull
    private Date end;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Employee> employees;

    private static final Finder<String, Project> finder = new Finder<>(Project.class);

    public Project() {
    }

    public Project(String id, String name, Date start, Date end, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.start = start;
        this.end = end;
        this.employees = employees;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart() {
        return start;
    }

    public String getStartString() {
        return new SimpleDateFormat("dd-MM-yy").format(start);
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public String getEndString() {
        return new SimpleDateFormat("dd-MM-yy").format(end);
    }

    public void setEnd(Date end) {
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