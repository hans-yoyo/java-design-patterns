package com.hyman.observer.basic;


/**
 * 描述: 被观察对象
 *
 * @author HUHAN
 * @created 2018-10-20 15:39:51
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

}
