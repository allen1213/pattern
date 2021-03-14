package com.example.demo.strategy.demo;

import com.example.strategy.demo.Order;
import com.example.strategy.demo.OrderHandler;
import com.example.strategy.demo.OrderHandlerType;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.AnnotationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootTest
public class Test01 {

    private Map<String, OrderHandler> orderHandlerMap;

    /*@Autowired
    public void setOrderHandlerMap(List<OrderHandler> orderHandlers) {

        orderHandlerMap = orderHandlers.stream().collect(
                Collectors.toMap(orderHandler -> AnnotationUtils.findAnnotation(orderHandler.getClass(), OrderHandlerType.class).source(),
                        v -> v,
                        (v1, v2) -> v1)
        );

    }*/

    @Test
    void orderService(Order order) {
        // 通过订单来源确定对应的handler
        OrderHandler orderHandler = orderHandlerMap.get(order.getSource());
        orderHandler.handle(order);
    }

}
