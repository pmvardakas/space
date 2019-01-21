package com.esoteric.space.models.project;

import com.esoteric.space.utilities.serialization.StringArrayDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WorkLocations implements Serializable {
    @JsonDeserialize(using = StringArrayDeserializer.class)
    private List<String> workLocation;

    public WorkLocations() {
        this.workLocation = new ArrayList<String>();
        this.workLocation.add("");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkLocations that = (WorkLocations) o;
        return Objects.equals(workLocation, that.workLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workLocation);
    }
}
