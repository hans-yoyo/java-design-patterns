package com.hyman.observer.basic;

import com.stu.pattern.observer.util.LimitQueueLink;

import java.util.LinkedList;

/**
 * 描述:
 *
 * @author HUHAN
 * @created 2018-10-20 21:43:26
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private float temperature;

    private Subject weatherData;

    LimitQueueLink<Float> queue = new LimitQueueLink<Float>(2);

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        LinkedList<Float> linkedList = queue.getQueue();
        if (linkedList.get(0) == linkedList.get(1)) {
            System.out.println("Forecast: keep the same");
        } else if (linkedList.get(0) > linkedList.get(1)) {
            System.out.println("Forecast: Improving weather on the way");
        } else if (linkedList.get(0) < linkedList.get(1)) {
            System.out.println("Forecast: cold weather on the way");
        }
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        if (queue.size() == 0) {
            queue.offerAll(temp);
        } else {
            queue.offer(temp);
        }
        display();
    }
}
