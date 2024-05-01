package com.example.plug_app.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
public class Valute {
    private final BigDecimal CNY;
    private final BigDecimal USD;
    private final BigDecimal EUR;
}
