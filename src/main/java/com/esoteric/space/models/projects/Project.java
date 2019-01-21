package com.esoteric.space.models.projects;

import java.io.Serializable;
import java.util.Objects;

public class Project implements Serializable {
    private long id;
    private String lastUpdated;

    public Project() {
        this.id = -1;
        this.lastUpdated = "";
    }

    public Project(long id, String lastUpdated) {
        this.id = id;
        this.lastUpdated = lastUpdated;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return id == project.id &&
                Objects.equals(lastUpdated, project.lastUpdated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastUpdated);
    }
}
