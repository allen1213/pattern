package com.example.demo.factory.strategy;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "ent")
public class EntAlias {

    private HashMap<String, String> aliasMap;

    public static final String DEFAULT_STRATEGY_NAME = "defaultStrategy";

    public HashMap<String, String> getAliasMap() {
        return aliasMap;
    }

    public void setAliasMap(HashMap<String, String > aliasMap) {
        this.aliasMap = aliasMap;
    }

    String of(String entNum) {
        return aliasMap.get(entNum);
    }
}
