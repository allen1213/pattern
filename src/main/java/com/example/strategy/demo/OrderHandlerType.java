package com.example.strategy.demo;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OrderHandlerType {

    String source();
}
