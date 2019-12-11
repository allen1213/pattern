package com.example.prototype.shape;

public class Client {

    public static void main(String[] args) {
        ShapeManager manager = new ShapeManager();
        Shape circle = manager.getShape("circle");
        Shape square = manager.getShape("square");

        Shape c = circle.clone();

        Shape s = square.clone();

        System.out.println(s == square);
        System.out.println(c == circle);

    }
}
