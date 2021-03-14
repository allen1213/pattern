package com.example.demo.factory.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class EntStrategyHolder {

    @Autowired
    private EntAlias entAlias;

    @Autowired
    private Map<String,EntStrategy> entStrategyMap;

    public EntStrategy getBy(String entNum) {
        String name = entAlias.of(entNum);
        if (name == null) {
            return entStrategyMap.get(EntAlias.DEFAULT_STRATEGY_NAME);
        }
        EntStrategy entStrategy = entStrategyMap.get(name);
        if (entStrategy == null) {
            return entStrategyMap.get(EntAlias.DEFAULT_STRATEGY_NAME);
        }
        return entStrategy;
    }

}
