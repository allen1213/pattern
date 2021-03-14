package com.example.decorator;

public class Client {

    public static void main(String[] args) {
        new Lipstick(new FoundationMakeup(new Girl())).show();
    }
}
