package com.ucd.DEE.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PerformanceMatrix {

    private String ip;
    private String slice;
    private double ram;
    private double cpu;

}
