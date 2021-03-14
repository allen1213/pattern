package com.example.strategy.demo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Order {
    //订单来源
    private String source;

    //支付方式
    private String payMethod;

}
