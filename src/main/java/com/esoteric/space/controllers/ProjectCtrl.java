package com.esoteric.space.controllers;

import com.esoteric.space.models.project.ProjectContainer;
import com.esoteric.space.models.projects.ProjectsContainer;
import com.esoteric.space.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProjectCtrl {
    private ProjectService projectService;

    @Autowired
    public ProjectCtrl(ProjectService projectService) {
        super();
        this.projectService = projectService;
    }

    @RequestMapping(value = "/projects", method = RequestMethod.GET)
    public ResponseEntity<ProjectsContainer> projects() {
        final ProjectsContainer projects = projectService.getProjects();

        return new ResponseEntity<>(projects, HttpStatus.OK);
    }

    @RequestMapping(
            value = "/projects/project",
            params = {"id"},
            method = RequestMethod.GET)
    public ResponseEntity<ProjectContainer> project(@RequestParam("id") final int id) {
        final ProjectContainer projectContainer = projectService.getProjectById(id);

        return new ResponseEntity<>(projectContainer, HttpStatus.OK);
    }
}
