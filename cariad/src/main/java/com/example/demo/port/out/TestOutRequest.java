package com.example.demo.port.out;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TestOutRequest {

    private String[] names;
}