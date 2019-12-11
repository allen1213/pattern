package com.example.prototype.demo02;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType r1 = new RealizeType();
        RealizeType clone = r1.clone();

        System.out.println(r1 == clone);
        System.out.println("hashCode : "  + r1.hashCode());
        System.out.println("hashCode : " + clone.hashCode());

    }
}

class RealizeType implements Cloneable {
    @Override
    protected RealizeType clone() throws CloneNotSupportedException {
        return (RealizeType)super.clone();
    }
}
