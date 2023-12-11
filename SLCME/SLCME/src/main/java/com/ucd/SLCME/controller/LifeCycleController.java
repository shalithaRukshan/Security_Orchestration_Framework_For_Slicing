package com.ucd.SLCME.controller;

import com.ucd.SLCME.service.LifeCycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LifeCycleController {

    @Autowired
    private LifeCycleService lifeCycleService;

    @GetMapping("/life-cycle")
    public ResponseEntity getLifeCycle() {

        lifeCycleService.getLifeCycle();
        return new ResponseEntity(HttpStatus.OK);
    }
}
