package com.example.proxy.dyna;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class KeywordFilter implements InvocationHandler {

    private List<String> blackList = Arrays.asList("电影", "游戏", "音乐", "小说");

    // 被代理的真实对象,猫、交换机、或是别的什么都是
    private Object origin;

    public KeywordFilter(Object origin) {
        this.origin = origin;
        System.out.println("开启关键字过滤模式...");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        String arg = args[0].toString();

        for (String s : blackList) {
            if (arg.contains(s)) {
                System.out.println("禁止访问 " + arg);
                return null;
            }
        }
        //调用真实的被代理对象方法
        return method.invoke(origin,arg);
    }
}
