package com.esoteric.space.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoCtrl {

    @RequestMapping("/")
    public ResponseEntity<String> about() {
        return new ResponseEntity<>("Service to process data from NASA APIs.", HttpStatus.OK);
    }

    @RequestMapping("/version")
    public ResponseEntity<String> version() {
        return new ResponseEntity<>("ALPHA v0", HttpStatus.OK);
    }
}
