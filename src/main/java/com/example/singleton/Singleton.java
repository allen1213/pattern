package com.example.singleton;

public class Singleton {
    /*private static Singleton singleton;

    private Singleton() {}

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }*/

    private static volatile Singleton singleton;

    private Singleton() {}

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }


}
