package com.esoteric.space.services;

import com.esoteric.space.models.ProjectReferenceContainer;
import com.esoteric.space.rest.TechportInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProjectService {

    private TechportInterface techportInterface;

    @Autowired
    public ProjectService(TechportInterface techportInterface) {
        super();
        this.techportInterface = techportInterface;
    }

    public ProjectReferenceContainer getProjects() {
        return techportInterface.getProjectListing();
    }
}
