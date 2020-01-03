package com.hyman.iterator.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HuHan
 * @description 抽象聚合类
 * @date 2020/01/03 14:02
 */
public abstract class AbstractObjectList {

    protected List<Object> objects = new ArrayList<>();

    public AbstractObjectList(List<Object> objects){
        this.objects = objects;
    }

    public void addObject(Object obj) {
        this.objects.add(obj);
    }

    public void removeObject(Object obj) {
        this.objects.remove(obj);
    }

    public List getObjects() {
        return this.objects;
    }

    //声明创建迭代器对象的抽象工厂方法
    public abstract AbstractIterator createIterator();

}
