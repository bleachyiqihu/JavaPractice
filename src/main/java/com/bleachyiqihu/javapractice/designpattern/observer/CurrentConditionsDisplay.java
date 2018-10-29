package com.ctrip.ops.app.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Paul on 2017-09-09
 */
public class CurrentConditionsDisplay implements Observer {
    private Observable observable;
    private float temperature;
    private float humidity;


    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherStation) {
            this.humidity = ((WeatherStation) o).getHumidity();
            this.temperature = ((WeatherStation) o).getTemperature();
        }
    }
}
