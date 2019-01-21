package com.esoteric.space.models.project;

import com.esoteric.space.utilities.serialization.TechnologyAreaArrayDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TechnologyAreas implements Serializable {
    @JsonDeserialize(using = TechnologyAreaArrayDeserializer.class)
    private List<TechnologyArea> technologyAreas;

    public TechnologyAreas() {
        this.technologyAreas = new ArrayList<TechnologyArea>();
        this.technologyAreas.add(new TechnologyArea());
    }

    public TechnologyAreas(List<TechnologyArea> technologyAreas) {
        this.technologyAreas = technologyAreas;
    }

    public List<TechnologyArea> getTechnologyAreas() {
        return technologyAreas;
    }

    public void setTechnologyAreas(List<TechnologyArea> technologyAreas) {
        this.technologyAreas = technologyAreas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TechnologyAreas that = (TechnologyAreas) o;
        return Objects.equals(technologyAreas, that.technologyAreas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(technologyAreas);
    }
}
