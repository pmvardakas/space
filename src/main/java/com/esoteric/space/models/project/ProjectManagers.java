package com.esoteric.space.models.project;

import com.esoteric.space.utilities.serialization.StringArrayDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProjectManagers implements Serializable {
    @JsonDeserialize(using = StringArrayDeserializer.class)
    private List<String> projectManager;

    public ProjectManagers() {
        this.projectManager = new ArrayList<String>();
        this.projectManager.add("");
    }

    public ProjectManagers(List<String> projectManager) {
        this.projectManager = projectManager;
    }

    public List<String> getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(List<String> projectManager) {
        this.projectManager = projectManager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectManagers that = (ProjectManagers) o;
        return Objects.equals(projectManager, that.projectManager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectManager);
    }
}
