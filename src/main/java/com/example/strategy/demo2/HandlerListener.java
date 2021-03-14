package com.example.strategy.demo2;

import com.example.strategy.demo.OrderHandlerType;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class HandlerListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Map<String, Object> map = event.getApplicationContext().getBeansWithAnnotation(OrderHandlerType.class);

        System.out.println(map);
    }
}
