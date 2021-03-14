package com.example.strategy.demo2;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Inherited
public @interface HandlerType {

    HandlerTypeEnum value();

}
