package com.esoteric.space.models.project;

import java.io.Serializable;
import java.util.Objects;

public class ProjectContainer implements Serializable {
    private Project project;

    public ProjectContainer() {
        this.project = new Project();
    }

    public ProjectContainer(Project project) {
        this.project = project;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectContainer that = (ProjectContainer) o;
        return Objects.equals(project, that.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project);
    }
}
