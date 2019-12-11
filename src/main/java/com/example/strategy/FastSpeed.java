package com.example.strategy;

public class FastSpeed implements ISpeedBehavior {
    @Override
    public void speed() {
        System.out.println("FastSpeed");
    }
}
