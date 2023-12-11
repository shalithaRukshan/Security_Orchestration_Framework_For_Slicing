package com.ucd.SSME.controller;

import com.ucd.SSME.service.MonitoringInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MonitoringController {

    @Autowired
    private MonitoringInfoService monitoringInfoService;

    @GetMapping("/mon-info")
    public ResponseEntity getMonitoringInfo() {

        monitoringInfoService.getMonitoringInfo();
        return new ResponseEntity(HttpStatus.OK);
    }
}
