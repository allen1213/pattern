package com.example.test;

public class Main02 implements Vehicle,FourWheeler{


    @Override
    public void print() {
        Vehicle.super.print();
    }

    public static void main(String[] args) {
        new Main02().print();
        Vehicle.blowHorn();
    }
}

interface Vehicle {
    default void print(){
        System.out.println("我是一辆车!");
    }
    static void blowHorn(){
        System.out.println("按喇叭!!!");
    }
}

interface FourWheeler {
    default void print(){
        System.out.println("我是一辆四轮车!");
    }
}
