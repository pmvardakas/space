package com.esoteric.space.models.project;

import com.esoteric.space.utilities.serialization.StringArrayDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

public class WorkLocations {

    @JsonDeserialize(using = StringArrayDeserializer.class)
    private List<String> workLocation;

    public WorkLocations() {
    }

    public WorkLocations(List<String> workLocation) {
        this.workLocation = workLocation;
    }

    public List<String> getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(List<String> workLocation) {
        this.workLocation = workLocation;
    }
}
