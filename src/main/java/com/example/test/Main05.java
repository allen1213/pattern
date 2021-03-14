package com.example.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.support.GenericGroovyApplicationContext;

import java.util.Optional;

public class Main05 {



    public static void main(String[] args) {

        //BeanFactory
        //FactoryBean
        //WebApplicationContext
//        GenericGroovyApplicationContext


    }

    private static void test02() {
        User user = new User("allen", "allen1213@123.com");

        Optional<User> opt = Optional.ofNullable(user);
        System.out.println(opt.isPresent());

        //opt.ifPresent(u -> System.out.println(u != null), user.getEmail());
    }

    private static void test01() {
        String name = "John";
        Optional<String> opt = Optional.ofNullable(name);

        System.out.println(opt.get());
    }
}
