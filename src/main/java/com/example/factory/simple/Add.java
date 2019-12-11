package com.example.factory.simple;

public class Add implements Operation {
    @Override
    public Long getResult(Long a, Long b) {
        return a + b;
    }
}
