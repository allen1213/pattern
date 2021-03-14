package com.example.strategy.demo2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HandlerTypeEnum {

    WECHAT_PAY(10001, "微信支付"),

    ALIPAY_PAY(10002, "支付宝支付"),

    WECHAT_ORDER(20001, "微信订单"),

    ALIPAY_ORDER(20002, "支付宝订单");

    private Integer code;

    private String desc;

}