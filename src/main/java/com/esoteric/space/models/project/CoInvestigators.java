package com.esoteric.space.models.project;

import com.esoteric.space.utilities.serialization.StringArrayDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CoInvestigators implements Serializable {
    @JsonDeserialize(using = StringArrayDeserializer.class)
    private List<String> coInvestigator;

    public CoInvestigators() {
        this.coInvestigator = new ArrayList<String>();
        this.coInvestigator.add("");
    }

    public CoInvestigators(List<String> coInvestigator) {
        this.coInvestigator = coInvestigator;
    }

    public List<String> getCoInvestigator() {
        return coInvestigator;
    }

    public void setCoInvestigator(List<String> coInvestigator) {
        this.coInvestigator = coInvestigator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoInvestigators that = (CoInvestigators) o;
        return Objects.equals(coInvestigator, that.coInvestigator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coInvestigator);
    }
}
