package com.example.strategy;

public class ShortLegZombie extends Character{

    public ShortLegZombie(IAttackBehavior attackBehavior,ISpeedBehavior speedBehavior) {
        this.attackBehavior = attackBehavior;
        this.speedBehavior = speedBehavior;
    }

    @Override
    void display() {
        System.out.println("I'm ShortLegZombie");
    }
}
