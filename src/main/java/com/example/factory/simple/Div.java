package com.example.factory.simple;

public class Div implements Operation {
    @Override
    public Long getResult(Long a, Long b) {
        if (b == 0) {
            return null;
        }
        return a / b;
    }
}
