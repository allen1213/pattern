package com.example.fly.weight;

public class ConcreteWebSite implements Website {

    private String name;

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("网站分类 : " + name);
    }
}
