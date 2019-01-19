package com.esoteric.space.services;

import com.esoteric.space.models.project.ProjectContainer;
import com.esoteric.space.models.projects.ProjectsContainer;
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

    public ProjectsContainer getProjects() {
        return techportInterface.getProjectListing();
    }

    public ProjectContainer getProjectById(final int id) {
        return techportInterface.getProjectById(id);
    }
}
