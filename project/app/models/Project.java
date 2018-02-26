package models;

import play.data.validation.Constraints.Required;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Project {

    @Id
    private Long id;

    @Required
    private String name;

    private Timestamp started;

    @Required
    private Timestamp deadline;

    public Project(String name, Timestamp deadline) {
        this.name = name;
        this.deadline = deadline;
    }

    public Project(String name, Timestamp started, Timestamp deadline) {
        this(name, deadline);
        this.started = started;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Timestamp getStarted() {
        return started;
    }

    public Timestamp getDeadline() {
        return deadline;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStarted(Timestamp started) {
        this.started = started;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }
}
