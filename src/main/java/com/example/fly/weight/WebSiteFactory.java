package com.example.fly.weight;

import java.util.HashMap;
import java.util.Map;

public class WebSiteFactory {

    private Map<String,Website> pool = new HashMap<>();

    public Website getWebSite(String type) {

        if (!pool.containsKey(type)) {
            pool.put(type,new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    public int getWebSiteCount() { return pool.size(); }

}
