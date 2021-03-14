package com.example.decorator;

public class Lipstick extends Decorator {
    public Lipstick(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.println("Lipstick");
        super.show();
        System.out.println("Lipstick");
    }
}
