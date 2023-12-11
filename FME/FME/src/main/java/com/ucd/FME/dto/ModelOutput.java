package com.ucd.FME.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.convert.DataSizeUnit;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ModelOutput {

    private String modelName;
    private int sliceId;
    private String tenant;
    private List<Double> modelParams;
}
