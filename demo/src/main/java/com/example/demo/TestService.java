package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;


public class TestService {

    @RequestMapping
    public String test() {
        return "/test1";
    }
}
