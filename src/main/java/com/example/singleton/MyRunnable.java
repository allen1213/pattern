package com.example.singleton;

public class MyRunnable implements Runnable {


    @Override
    public void run() {

        Singleton instance = Singleton.getInstance();
        System.out.println("hashCode : " + instance.hashCode() + "    " + instance.toString());

    }
}
