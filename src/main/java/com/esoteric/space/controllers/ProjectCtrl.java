package com.esoteric.space.controllers;

import com.esoteric.space.models.project.ProjectContainer;
import com.esoteric.space.models.projects.ProjectsContainer;
import com.esoteric.space.services.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public ProjectsContainer projects() {
        logger.info("projects()");

        final ProjectsContainer projects = projectService.getProjects();

        return projects;
    }

    @RequestMapping(
            value = "/projects/project",
            params = {"id"},
            method = RequestMethod.GET)
    public ProjectContainer project(@RequestParam("id") final int id) {
        final ProjectContainer projectContainer = projectService.getProjectById(id);

        return projectContainer;
    }
}
