package com.esoteric.space.models.project;

import com.esoteric.space.utilities.serialization.StringArrayDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrincipalInvestigators implements Serializable {
    @JsonDeserialize(using = StringArrayDeserializer.class)
    private List<String> principalInvestigator;

    public PrincipalInvestigators() {
        this.principalInvestigator = new ArrayList<String>();
        this.principalInvestigator.add("");
    }

    public PrincipalInvestigators(List<String> principalInvestigator) {
        this.principalInvestigator = principalInvestigator;
    }

    public List<String> getPrincipalInvestigator() {
        return principalInvestigator;
    }

    public void setPrincipalInvestigator(List<String> principalInvestigator) {
        this.principalInvestigator = principalInvestigator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrincipalInvestigators that = (PrincipalInvestigators) o;
        return Objects.equals(principalInvestigator, that.principalInvestigator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principalInvestigator);
    }
}
