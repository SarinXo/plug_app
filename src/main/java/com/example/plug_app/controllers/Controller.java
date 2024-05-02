package com.example.plug_app.controllers;

import com.example.plug_app.models.Valute;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@Slf4j
public class Controller {
    private final static Valute valute = new Valute(
            BigDecimal.valueOf(13.18),
            BigDecimal.valueOf(93.43),
            BigDecimal.valueOf(99.65)
    );

    @GetMapping("/exchange-rate")
    public Valute getExchangeRate() throws InterruptedException {
        log.info("getExchangeRate() Was used");
        Thread.sleep(500);
        if((int)(Math.random() * 2) == 1){
            throw new RuntimeException("fifty - fifty");
        }

        return valute;
    }
}
