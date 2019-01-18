package com.esoteric.space.rest;

import com.esoteric.space.models.ProjectReferenceContainer;
import com.esoteric.space.utilities.SecurityStrings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TechportInterface {

    Logger logger = LoggerFactory.getLogger(TechportInterface.class);


    private static final String URL = "https://api.nasa.gov/techport/api/";
    private RestTemplate template;
    private SecurityStrings sec;

    @Autowired
    public TechportInterface(RestTemplateBuilder builder, SecurityStrings sec) {
        this.template = builder.build();
        this.sec = sec;
    }

    public ProjectReferenceContainer getProjectListing() {
        ProjectReferenceContainer data = template.getForObject(URL + "projects" + "?" + sec.getApiPrefix() + sec.getApiKey(), ProjectReferenceContainer.class);

        return data;
    }
}
