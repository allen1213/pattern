package com.example.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject{

    private float temperature;

    private float pressure;

    private float humidity;

    private List<IObserver> observers;

    public WeatherData() {
        observers = new ArrayList<IObserver>();
    }


    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (IObserver o : observers) {
            o.update(getTemperature(),getPressure(),getHumidity());
        }
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    private void dataChange() {
        notifyObserver();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
