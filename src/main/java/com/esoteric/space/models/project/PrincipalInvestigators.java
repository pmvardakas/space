package com.esoteric.space.models.project;

import com.esoteric.space.utilities.serialization.StringArrayDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

public class PrincipalInvestigators {
    @JsonDeserialize(using = StringArrayDeserializer.class)
    private List<String> principalInvestigator;

    public PrincipalInvestigators() {
    }

    public List<String> getPrincipalInvestigator() {
        return principalInvestigator;
    }

    public void setPrincipalInvestigator(List<String> principalInvestigator) {
        this.principalInvestigator = principalInvestigator;
    }
}
