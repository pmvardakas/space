package com.esoteric.space.controllers;

import com.esoteric.space.models.ApodData;
import com.esoteric.space.services.ApodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApodCtrl {
    Logger logger = LoggerFactory.getLogger(ApodCtrl.class);

    private ApodService apodService;

    @Autowired
    public ApodCtrl(ApodService apodService) {
        super();
        this.apodService = apodService;
    }

    @RequestMapping(value = "/apod")
    public ApodData apod() {
        logger.info("apod()");

        return apodService.getPictureOfTheDay();
    }
}
