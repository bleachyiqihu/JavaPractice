package com.ctrip.ops.app.designpattern.observer;

import java.util.Observable;

/**
 * Created by Paul on 2017-09-09
 */
public class WeatherStation extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
