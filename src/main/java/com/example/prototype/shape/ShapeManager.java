package com.example.prototype.shape;

import java.util.HashMap;
import java.util.Map;

public class ShapeManager {

    private Map<String,Shape> map = new HashMap<>();

    public ShapeManager() {
        map.put("circle",new Circle());
        map.put("square",new Square());
    }

    public void addShape(String key,Shape value) {
        map.put(key,value);
    }

    public Shape getShape(String key) {
        return map.get(key).clone();
    }


}
