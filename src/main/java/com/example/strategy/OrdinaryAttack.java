package com.example.strategy;

public class OrdinaryAttack implements IAttackBehavior {
    @Override
    public void attack() {
        System.out.println("OrdinaryAttack");
    }
}
