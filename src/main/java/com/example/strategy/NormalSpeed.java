package com.example.strategy;

public class NormalSpeed implements ISpeedBehavior {
    @Override
    public void speed() {
        System.out.println("NormalSpeed");
    }
}
