package com.esoteric.space.models.project;

import com.esoteric.space.utilities.serialization.StringArrayDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

public class CoInvestigators {
    @JsonDeserialize(using = StringArrayDeserializer.class)
    private List<String> coInvestigator;

    public CoInvestigators() {
    }

    public List<String> getCoInvestigator() {
        return coInvestigator;
    }

    public void setCoInvestigator(List<String> coInvestigator) {
        this.coInvestigator = coInvestigator;
    }
}
