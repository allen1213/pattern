package com.example.factory.simple;

public class Sub implements Operation {

    @Override
    public Long getResult(Long a, Long b) {
        return a - b;
    }
}
