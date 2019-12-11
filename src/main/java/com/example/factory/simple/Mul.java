package com.example.factory.simple;

public class Mul implements Operation {

    @Override
    public Long getResult(Long a, Long b) {
        return a * b;
    }
}
