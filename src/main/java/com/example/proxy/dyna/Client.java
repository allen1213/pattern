package com.example.proxy.dyna;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {

        Internet  internet = (Internet) Proxy.newProxyInstance(
                Modem.class.getClassLoader(),
                Modem.class.getInterfaces(),
                new KeywordFilter(new Modem())
        );
        internet.access("http://www.电影.com");
        internet.access("http://www.游戏.com");
        internet.access("ftp://www.学习.com/java");
        internet.access("http://www.工作.com");

        Intranet  intranet = (Intranet) Proxy.newProxyInstance(
                Switch.class.getClassLoader(),
                Switch.class.getInterfaces(),
                new KeywordFilter(new Switch())
        );
        intranet.fileAccess("http://www.电影.com");
        intranet.fileAccess("http://www.游戏.com");
        intranet.fileAccess("ftp://www.学习.com/java");
        intranet.fileAccess("http://www.工作.com");
    }
}
