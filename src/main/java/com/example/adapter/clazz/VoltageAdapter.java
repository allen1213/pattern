package com.example.adapter.clazz;

public class VoltageAdapter extends Voltage220 implements Voltage5V {
    @Override
    public int output5V() {

        int i = output220();

        System.out.println("5V");
        return i/44;
    }
}
