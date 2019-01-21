package com.esoteric.space.models.project;

import com.esoteric.space.utilities.serialization.StringArrayDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProgramDirectors implements Serializable {
    @JsonDeserialize(using = StringArrayDeserializer.class)
    private List<String> programDirector;

    public ProgramDirectors() {
        this.programDirector = new ArrayList<String>();
        this.programDirector.add("");
    }

    public ProgramDirectors(List<String> programDirector) {
        this.programDirector = programDirector;
    }

    public List<String> getProgramDirector() {
        return programDirector;
    }

    public void setProgramDirector(List<String> programDirector) {
        this.programDirector = programDirector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgramDirectors that = (ProgramDirectors) o;
        return Objects.equals(programDirector, that.programDirector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(programDirector);
    }
}
