package com.ucd.FME.controller;

import com.ucd.FME.dto.ModelOutput;
import com.ucd.FME.service.ModelOutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ModelInputsController {

    @Autowired
    private ModelOutputService modelOutputService;

    @PostMapping("/model-outputs")
    public ResponseEntity processModelOutputs(@RequestBody ModelOutput modelOutput) {

        modelOutputService.processModelOutputs(modelOutput);

        return new ResponseEntity(HttpStatus.OK);
    }

}
