package com.example.factory.method;

public class USAPizzaFactory implements PizzaFactory{

    @Override
    public Pizza createPizza(String local) {

        Pizza pizza = null;

        switch (local) {

            case "cheese":
                pizza = new USACheesePizza();
                pizza.show();
                break;
            case "greek":
                pizza = new USAGreekPizza();
                pizza.show();
                break;

        }

        return pizza;
    }

}
