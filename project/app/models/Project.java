package models;

import io.ebean.Finder;
import io.ebean.Model;
import models.users.Employee;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class Project extends Model {

    @Id
    private String id;
    private String name;
    private DateTime start;
    private DateTime end;

    private static final Finder<String, Project> finder = new Finder<>(Project.class);

    public Project() {
    }

    public Project(String id, String name, DateTime start, DateTime end) {
        this.id = id;
        this.name = name;
        this.start = start;
        this.end = end;
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

    public static Finder<String, Project> getFinder() {
        return finder;
    }

    public static List<Project> findAll() {
        return Project.finder.all();
    }


}