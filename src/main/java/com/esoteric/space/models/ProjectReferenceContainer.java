package com.esoteric.space.models;

import java.io.Serializable;
import java.util.Objects;

public class ProjectReferenceContainer implements Serializable {
    private ProjectReferenceListing projects;

    public ProjectReferenceContainer() {
    }

    public ProjectReferenceContainer(ProjectReferenceListing projects) {
        this.projects = projects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectReferenceContainer that = (ProjectReferenceContainer) o;
        return Objects.equals(projects, that.projects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projects);
    }

    public ProjectReferenceListing getProjects() {
        return projects;
    }

    public void setProjects(ProjectReferenceListing projects) {
        this.projects = projects;
    }
}
