package ru.baskaeva.moneytransferservice.dto;

import lombok.Data;

@Data
public class Amount {
    private Long value;
    private String currency;

    @Override
    public String toString() {
        return "value: " + value + "\ncurrency: " + currency;
    }
}