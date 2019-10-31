package com.hyman.observer.basic;

/**
 * 描述:
 *
 * @author HUHAN
 * @created 2018-10-20 21:21:25
 */
public class StatisticsDisplay implements Observer {

    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticsDisplay.update: " + temp + " " + humidity + " " + pressure);
    }

}
