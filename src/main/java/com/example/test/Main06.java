package com.example.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main06 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //BeanDefinitionRegistry
        //BeanFactory
        //AnnotationConfigApplicationContext
//        ApplicationContextAware
//        BeanFactoryAware
//        ApplicationContext
        //DefaultListableBeanFactory
        Class<Main06> main06Class = Main06.class;
        Main06 main06 = main06Class.newInstance();
        Method method =
                Main06.class.getMethod("show", String.class, int.class);

        method.invoke(main06,new Object[]{"allen",13});



    }

    public void show(String name,int age) {
        System.out.println("name : " + name + ",age : " + age);
    }
}
