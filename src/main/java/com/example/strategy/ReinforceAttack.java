package com.example.strategy;

public class ReinforceAttack implements IAttackBehavior {
    @Override
    public void attack() {
        System.out.println("ReinforceAttack");
    }
}
