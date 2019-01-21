package com.esoteric.space.models.project;

import com.esoteric.space.utilities.serialization.OrganizationArrayDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Organizations implements Serializable {
    @JsonDeserialize(using = OrganizationArrayDeserializer.class)
    private List<Organization> organization;

    public Organizations() {
        this.organization = new ArrayList<Organization>();
        this.organization.add(new Organization());
    }

    public Organizations(List<Organization> organization) {
        this.organization = organization;
    }

    public List<Organization> getOrganization() {
        return organization;
    }

    public void setOrganization(List<Organization> organization) {
        this.organization = organization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organizations that = (Organizations) o;
        return Objects.equals(organization, that.organization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organization);
    }
}
