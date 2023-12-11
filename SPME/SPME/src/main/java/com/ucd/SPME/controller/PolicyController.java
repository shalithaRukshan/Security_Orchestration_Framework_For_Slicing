package com.ucd.SPME.controller;

import com.ucd.SPME.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @GetMapping("/policies")
    public ResponseEntity getPolicies() {

        policyService.getPolicies();

        return new ResponseEntity(HttpStatus.OK);
    }
}
