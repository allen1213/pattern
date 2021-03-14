package com.example.strategy.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/order")
    public String order() {
        orderService.orderService(new Order().setSource("pc").setPayMethod("alipay"));
        return "order";
    }

}
