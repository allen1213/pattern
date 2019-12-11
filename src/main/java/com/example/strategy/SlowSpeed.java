package com.example.strategy;

public class SlowSpeed implements ISpeedBehavior{
    @Override
    public void speed() {
        System.out.println("SlowSpeed");
    }
}
