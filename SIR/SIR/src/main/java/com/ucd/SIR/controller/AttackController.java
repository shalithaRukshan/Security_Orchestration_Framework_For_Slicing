package com.ucd.SIR.controller;

import com.ucd.SIR.service.AttackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AttackController {

    @Autowired
    private AttackService attackService;

    @GetMapping("/attacks")
    public ResponseEntity getAttacks() {

        attackService.getAttacks();

        return new ResponseEntity(HttpStatus.OK);
    }

}
