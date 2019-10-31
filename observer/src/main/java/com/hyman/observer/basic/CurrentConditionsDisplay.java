package com.hyman.observer.basic;

/**
 * 描述:
 *
 * @author HUHAN
 * @created 2018-10-20 16:10:51
 */
public class CurrentConditionsDisplay implements Observer {

    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        System.out.println("CurrentConditionsDisplay.update: " + temp + " " + humidity + " " + pressure);
    }
}
