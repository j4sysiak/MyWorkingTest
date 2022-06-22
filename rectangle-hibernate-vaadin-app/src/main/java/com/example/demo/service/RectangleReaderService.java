package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RectangleReaderService {

    //wstrzyknięcie wartości z konfiguracji
    @Value("{siteA1}")
    private int siteA1;

    @Value("{siteB1}")
    private int siteB1;

    @Value("{siteA2}")
    private int siteA2;

    @Value("{siteB2}")
    private int siteB2;

    @Value("{siteA3}")
    private int siteA3;

    @Value("{siteB3}")
    private int siteB3;

    @Value("{siteA4}")
    private int siteA4;

    @Value("{siteB4}")
    private int siteB4;
}
