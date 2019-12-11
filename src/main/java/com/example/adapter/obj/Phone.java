package com.example.adapter.obj;

public class Phone {

    public void charging(Voltage5V v) {
        if (v.output5V() == 5) {
            System.out.println("charging...");
        } else {
            System.out.println("cant charge!!!");
        }
    }

}
