package com.esoteric.space.models.project;

import com.esoteric.space.utilities.serialization.StringArrayDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

public class ProgramManagers {
    @JsonDeserialize(using = StringArrayDeserializer.class)
    private List<String> programManager;

    public ProgramManagers() {
    }

    public List<String> getProgramManager() {
        return programManager;
    }

    public void setProgramManager(List<String> programManager) {
        this.programManager = programManager;
    }
}
