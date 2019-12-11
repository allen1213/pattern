package com.example.singleton;

public class Test01 {

    public static void main(String[] args) {
        Singletons instsnce1 = Singletons.INSTSNCE;
        Singletons instsnce2 = Singletons.INSTSNCE;

        System.out.println(instsnce1 == instsnce2);
        System.out.println(instsnce1.hashCode());
        System.out.println(instsnce2.hashCode());

    }
}

enum Singletons {
    INSTSNCE;
}
