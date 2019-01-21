package com.esoteric.space.models.projects;

import com.esoteric.space.utilities.serialization.ProjectArrayDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonDeserialize(using = ProjectArrayDeserializer.class)
public class ProjectsContainer implements Serializable {
    private long totalCount;
    private List<Project> projects;

    public ProjectsContainer() {
        this.totalCount = 0;
        this.projects = new ArrayList<Project>();
    }

    public ProjectsContainer(long totalCount, List<Project> projects) {
        this.totalCount = totalCount;
        this.projects = projects;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectsContainer that = (ProjectsContainer) o;
        return totalCount == that.totalCount &&
                Objects.equals(projects, that.projects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, projects);
    }
}
