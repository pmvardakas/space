package com.esoteric.space.models.project;

import com.esoteric.space.utilities.serialization.StringArrayDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

public class ProgramDirectors {
    @JsonDeserialize(using = StringArrayDeserializer.class)
    private List<String> programDirector;

    public ProgramDirectors() {
    }

    public List<String> getProgramDirector() {
        return programDirector;
    }

    public void setProgramDirector(List<String> programDirector) {
        this.programDirector = programDirector;
    }
}
