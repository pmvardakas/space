package com.esoteric.space.models;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class ProjectReferenceListing implements Serializable {
    private List<ProjectReference> projects;
    private int totalCount;


    public ProjectReferenceListing() {
    }

    public ProjectReferenceListing(List<ProjectReference> projects, int totalCount) {
        this.projects = projects;
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectReferenceListing that = (ProjectReferenceListing) o;
        return totalCount == that.totalCount &&
                Objects.equals(projects, that.projects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projects, totalCount);
    }

    public List<ProjectReference> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectReference> projects) {
        this.projects = projects;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
