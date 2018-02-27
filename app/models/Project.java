package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints.Required;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Project extends Model {
    @Id
    private Long id;

    @Required
    private String name;

    @ManyToMany
    private List<Employee> employees;


    public Project() {
    }

    public Project(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static final Finder<Long, Project> find = new Finder<>(Project.class);
    
    public static final List<Project> findAll() {
        return Project.find.all();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}