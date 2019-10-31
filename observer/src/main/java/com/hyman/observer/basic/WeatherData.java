package com.hyman.observer.basic;

import java.util.ArrayList;

/**
 * 描述:
 *
 * @author HUHAN
 * @created 2018-10-20 16:00:01
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;

    private float temperature;

    private float humidity;

    private float pressure;

    /**
     * 构造方法中创建 观察者s
     */
    public WeatherData() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        if (observers.indexOf(o) != -1) {
            observers.remove(o);
        }
    }

    /**
     * 数据信息变化,通知所有观察者
     */
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 数据发生变化
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 各参数赋值
     *
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
