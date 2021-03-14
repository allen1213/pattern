package com.example.observer;

public class CurrentConditions implements IObserver{

    private float temperature;

    private float pressure;

    private float humidity;

    /*public CurrentConditions(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }*/

    //使用推送模式由WeatherData来调用
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("temperature : " + temperature);
        System.out.println("pressure : " + pressure);
        System.out.println("humidity : " + humidity);
    }
}
