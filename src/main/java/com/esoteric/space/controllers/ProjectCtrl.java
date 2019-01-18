package com.esoteric.space.controllers;

import com.esoteric.space.models.ProjectReferenceContainer;
import com.esoteric.space.services.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectCtrl {
    Logger logger = LoggerFactory.getLogger(ProjectCtrl.class);

    private ProjectService projectService;

    @Autowired
    public ProjectCtrl(ProjectService projectService) {
        super();
        this.projectService = projectService;
    }

    @RequestMapping(value = "/projects", method = RequestMethod.GET)
    public ProjectReferenceContainer projects() {
        logger.info("projects()");

        final ProjectReferenceContainer projects = projectService.getProjects();

        return projects;
    }
}
