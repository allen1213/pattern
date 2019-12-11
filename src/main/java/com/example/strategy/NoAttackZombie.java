package com.example.strategy;

public class NoAttackZombie extends Character{

    public NoAttackZombie(IAttackBehavior attackBehavior,ISpeedBehavior speedBehavior) {
        this.attackBehavior = attackBehavior;
        this.speedBehavior = speedBehavior;
    }

    @Override
    void display() {
        System.out.println("I'm NoAttackZombie");
    }
}
