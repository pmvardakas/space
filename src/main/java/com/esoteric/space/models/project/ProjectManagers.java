package com.esoteric.space.models.project;

import com.esoteric.space.utilities.serialization.StringArrayDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

public class ProjectManagers {
    @JsonDeserialize(using = StringArrayDeserializer.class)
    private List<String> projectManager;

    public ProjectManagers() {
    }

    public List<String> getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(List<String> projectManager) {
        this.projectManager = projectManager;
    }
}
