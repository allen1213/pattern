package com.example.factory.method;

public class UKPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza(String local) {

        Pizza pizza = null;

        switch (local) {
            case "cheese":
                pizza = new UKCheesePizza();
                pizza.show();
                break;
            case "greek":
                pizza = new UKGreekPizza();
                pizza.show();
                break;
        }

        return pizza;
    }
}
