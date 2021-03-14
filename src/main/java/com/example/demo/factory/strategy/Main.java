package com.example.demo.factory.strategy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.example.demo.factory.strategy"})
public class Main {

    public static void main(String[] args) {

        send("entA");

        send("entB");

        send("entC");

    }

    public static void send(String entNum) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        context.getBean(EntStrategyHolder.class)
                .getBy(entNum)
                .send();

    }

}
