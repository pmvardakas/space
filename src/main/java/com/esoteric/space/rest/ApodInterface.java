package com.esoteric.space.rest;

import com.esoteric.space.models.ApodData;
import com.esoteric.space.utilities.SecurityStrings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApodInterface {

    private static final String URL = "https://api.nasa.gov/planetary/apod";
    private RestTemplate template;
    private SecurityStrings sec;

    @Autowired
    public ApodInterface(RestTemplateBuilder builder, SecurityStrings sec) {
        this.template = builder.build();
        this.sec = sec;
    }

    public ApodData getAstronomyPictureOfTheDay() {
        ApodData data = template.getForObject(URL + "?" + sec.getApiPrefix() + sec.getApiKey(), ApodData.class);

        return data;
    }
}
