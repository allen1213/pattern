package com.example.strategy;

public class Test {

    public static void main(String[] args) {
        Character character = new RedHeadZombie(new SuperAttack(),new FastSpeed());
        character.display();
        character.speed();
        character.attack();
    }
}
