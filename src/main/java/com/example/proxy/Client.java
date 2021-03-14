package com.example.proxy;

public class Client {

    public static void main(String[] args) {
        Internet proxy = new RouterProxy();//实例化的是代理
        proxy.access("http://www.电影.com");
        proxy.access("http://www.游戏.com");
        proxy.access("ftp://www.学习.com/java");
        proxy.access("http://www.工作.com");
    }

}
