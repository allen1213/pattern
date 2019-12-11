package com.example.strategy;

public class SuperAttack implements IAttackBehavior {
    @Override
    public void attack() {
        System.out.println("SuperAttack");
    }
}
