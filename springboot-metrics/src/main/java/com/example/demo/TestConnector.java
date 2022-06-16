package com.example.demo;


import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="test-connector")
public class TestConnector {

    public String get() {
        return "";
    }
}
