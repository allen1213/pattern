package com.example.proxy;

import java.util.Arrays;
import java.util.List;

public class RouterProxy implements Internet {

    //持有被代理引用
    private Internet modem;

    private List<String> blackList = Arrays.asList("电影", "游戏", "音乐", "小说");

    public RouterProxy() {
        this.modem = new Modem();
        System.out.println("拨号上网成功");
    }

    @Override
    public void access(String url) {
        for (String s : blackList) {
            if (url.contains(s)) {
                System.out.println("禁止访问 " + url);
                return;
            }
        }
        modem.access(url);
    }
}
