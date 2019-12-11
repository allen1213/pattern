package com.example.strategy;

public class GreenHeadZombie extends Character{

    public GreenHeadZombie(IAttackBehavior attackBehavior,ISpeedBehavior speedBehavior) {
        this.attackBehavior = attackBehavior;
        this.speedBehavior = speedBehavior;
    }

    @Override
    void display() {
        System.out.println("I'm GreenHeadZombie");
    }
}
