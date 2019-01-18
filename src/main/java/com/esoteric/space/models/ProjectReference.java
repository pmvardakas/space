package com.esoteric.space.models;

import java.util.Objects;

public class ProjectReference {
    private int id;
    private String lastUpdated;

    public ProjectReference() {
    }

    public ProjectReference(int id, String lastUpdated) {
        this.id = id;
        this.lastUpdated = lastUpdated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectReference that = (ProjectReference) o;
        return id == that.id &&
                Objects.equals(lastUpdated, that.lastUpdated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastUpdated);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
