package com.example.decorator;

public class FoundationMakeup extends Decorator {
    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.println("FoundationMakeup");
        super.show();
        System.out.println("FoundationMakeup");
    }
}
