package com.ucd.SIR.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AttackHistoryController {

    @GetMapping("/attack-history")
    public ResponseEntity getAttacks() {

        return new ResponseEntity(HttpStatus.OK);
    }
}
