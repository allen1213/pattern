package com.example.strategy;

public class RedHeadZombie extends Character {

    public RedHeadZombie(IAttackBehavior attackBehavior,ISpeedBehavior speedBehavior) {
        this.attackBehavior = attackBehavior;
        this.speedBehavior = speedBehavior;
    }

    @Override
    void display() {
        System.out.println("I'm RedHeadZombie");
    }
}
