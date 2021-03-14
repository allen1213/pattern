package com.example.strategy.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class OrderHandlerConfig {

    @Bean
    public List<OrderHandler> orderHandlers() {

        OrderHandler[] orderArray = {new PCOrderHandler(),new MobileOrderHandler()};

        return Arrays.asList(orderArray);
    }

}
