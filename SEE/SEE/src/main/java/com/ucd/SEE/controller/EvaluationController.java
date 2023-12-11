package com.ucd.SEE.controller;

import com.ucd.SEE.dto.Event;
import com.ucd.SEE.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EvaluationController {

    @Autowired
    private EventService eventService;

    @PostMapping("/events")
    public ResponseEntity processEvents (@RequestBody Event event) {

        eventService.processEvents(event);
        return new ResponseEntity(HttpStatus.OK);
    }
}
