package com.esoteric.space.models.project;

import java.util.List;

public class Organizations {
    private List<Organization> organization;

    public Organizations() {
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
}
