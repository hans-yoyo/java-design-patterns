package com.hyman.factory.basic.simplefactory;

/**
 * @author HuHan
 * @description 可将type进一步封装为枚举类
 * @date 2019/10/31 10:11
 */
public class SimpleFactory {

    public Product createProduct(int type) {
        if (type == 1) {
            return new ConcreteProductA();
        } else if (type == 2) {
            return new ConcreteProductB();
        }
        return new ConcreteProductC();
    }

}
