package models;

import io.ebean.Finder;
import io.ebean.Model;
import org.joda.time.DateTime;
import play.data.validation.Constraints.Required;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.List;

@Entity
public class Project extends Model {

    @Id
    private Long id;

    @Required
    private String name;

    @OneToMany
    private Employee manager;

    private DateTime start;

    private DateTime end;

    @ManyToMany
    private List<Employee> employees;


    public Project() {
    }

    public Project(Long id, String name, Employee manager, DateTime start, DateTime end, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.manager = manager;
        this.start = start;
        this.end = end;
        this.employees = employees;
    }

    public static final Finder<Long, Project> find = new Finder<>(Project.class);
    
    public static List<Project> findAll() {
        return Project.find.all();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
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

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void addAllEmployees(Collection<Employee> employees) {
        this.employees.addAll(employees);
    }

    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }

    public void removeAllEnployee(Collection<Employee> employees) {
        this.employees.removeAll(employees);
    }


}