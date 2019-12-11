package com.example.strategy;

public abstract class Character {

    public ISpeedBehavior speedBehavior;

    public IAttackBehavior attackBehavior;

    void move() {
        System.out.println("move");
    }

    void attack() {
        attackBehavior.attack();
    }

    void speed() {
        speedBehavior.speed();
    }

    abstract void display();

    public ISpeedBehavior getSpeedBehavior() {
        return speedBehavior;
    }

    public void setSpeedBehavior(ISpeedBehavior speedBehavior) {
        this.speedBehavior = speedBehavior;
    }

    public IAttackBehavior getAttackBehavior() {
        return attackBehavior;
    }

    public void setAttackBehavior(IAttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }
}
