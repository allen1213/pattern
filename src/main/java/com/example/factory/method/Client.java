package com.example.factory.method;

public class Client {


    public static void main(String[] args) {
        String local = "UK";

        if ("USA".equals(local)) {
            new USAPizzaFactory().createPizza("cheese");
        } else {
            new UKPizzaFactory().createPizza("greek");
        }

    }
}
