package com.example.prototype.shape;

public class Square implements Shape {
    @Override
    public Shape clone() {

        Square clone = null;

        try {

            clone = (Square) super.clone();


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

    @Override
    public void countArea() {
        System.out.println("The Square Area");
    }
}
