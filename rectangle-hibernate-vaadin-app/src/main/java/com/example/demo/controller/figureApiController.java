package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class figureApiController {

    @GetMapping("/calculate")
    public int calculate(@RequestParam String figure,
                         @RequestParam int siteA,
                         @RequestParam int siteB,
                         @RequestParam int siteC) {
        if (figure.equalsIgnoreCase("RECTANGLE")) {
            return 2 * siteA + 2 * siteB;
        } else if (figure.equalsIgnoreCase("CIRCLE")) {
            return siteA + siteB + siteC;
        }
        return -1;
    }
}
