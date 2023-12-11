package com.ucd.DEE.controller;


import com.ucd.DEE.dto.PerformanceMatrix;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.Media;

@RestController
@RequestMapping("/api")
public class MonitoringInfoController {

    @PostMapping(value = "/performance-matrix", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getPerformanceMatrices(@RequestBody PerformanceMatrix performanceMatrix) {

        return new ResponseEntity(HttpStatus.OK);
    }

}
