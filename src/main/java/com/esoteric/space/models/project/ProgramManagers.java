package com.esoteric.space.models.project;

import com.esoteric.space.utilities.serialization.StringArrayDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProgramManagers implements Serializable {
    @JsonDeserialize(using = StringArrayDeserializer.class)
    private List<String> programManager;

    public ProgramManagers() {
        this.programManager = new ArrayList<String>();
        this.programManager.add("");
    }

    public ProgramManagers(List<String> programManager) {
        this.programManager = programManager;
    }

    public List<String> getProgramManager() {
        return programManager;
    }

    public void setProgramManager(List<String> programManager) {
        this.programManager = programManager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgramManagers that = (ProgramManagers) o;
        return Objects.equals(programManager, that.programManager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(programManager);
    }
}
