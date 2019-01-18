package com.esoteric.space.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoCtrl {

    @RequestMapping("/")
    public String about() {
        return "Service to process data from NASA APIs.";
    }

    @RequestMapping("/version")
    public String version() {
        return "ALPHA v0";
    }
}
