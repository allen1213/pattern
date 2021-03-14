package com.example.observer;

import java.util.HashSet;

public class Client {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(new CurrentConditions());

        weatherData.setData(10.0f,12.0f,13.0f);
        weatherData.notifyObserver();

    }
}
