package com.example.prototype.shape;

public class Circle implements Shape {
    @Override
    public Shape clone() {

        Circle clone = null;
        try {

            clone = (Circle) super.clone();


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

    @Override
    public void countArea() {
        System.out.println("The Circle Area");
    }
}
