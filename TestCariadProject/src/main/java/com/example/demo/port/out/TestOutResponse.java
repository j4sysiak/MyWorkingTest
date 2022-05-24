package com.example.demo.port.out;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class TestOutResponse {
    private List<String> listOfStrings;
}
