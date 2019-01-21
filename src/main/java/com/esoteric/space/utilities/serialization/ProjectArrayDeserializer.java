package com.esoteric.space.utilities.serialization;

import com.esoteric.space.models.project.ProjectContainer;
import com.esoteric.space.models.project.TechnologyArea;
import com.esoteric.space.models.projects.Project;
import com.esoteric.space.models.projects.ProjectsContainer;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProjectArrayDeserializer extends JsonDeserializer<ProjectsContainer> {

    @Override
    public ProjectsContainer deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        ObjectCodec oc = p.getCodec();
        JsonNode node = oc.readTree(p);
        ProjectsContainer projects = new ProjectsContainer();

        JsonNode totalCountNode = node.get("projects").get("totalCount");
        projects.setTotalCount(totalCountNode.longValue());

        List<Project> projectList = new ArrayList<Project>();
        JsonNode projectsNode = node.get("projects").get("projects");

        if (projectsNode.isArray()) {
            for (Iterator<JsonNode> i = projectsNode.iterator(); i.hasNext(); ) {
                projectList.add(mapNodeToProject(i.next()));
            }
        }

        if (projectsNode.isObject()) {
            projectList.add(mapNodeToProject(projectsNode));
        }

        projects.setProjects(projectList);

        return projects;
    }

    private Project mapNodeToProject(JsonNode node) {
        Project item = new Project();

        if (node.has("id")) {
            item.setId((node.get("id")).longValue());
        }
        if (node.has("lastUpdated")) {
            item.setLastUpdated(node.get("lastUpdated").asText(""));
        }

        return item;
    }
}
