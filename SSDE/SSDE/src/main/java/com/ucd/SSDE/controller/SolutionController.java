package com.ucd.SSDE.controller;

import com.ucd.SSDE.service.SolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SolutionController {

    @Autowired
    private SolutionService solutionService;

    @GetMapping("/attacks")
    public ResponseEntity getSolutions() {

        solutionService.getSolutions();

        return new ResponseEntity(HttpStatus.OK);
    }
}
