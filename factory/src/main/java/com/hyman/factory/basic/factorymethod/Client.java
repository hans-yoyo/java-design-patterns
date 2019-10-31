package com.hyman.factory.basic.factorymethod;

import com.hyman.factory.basic.simplefactory.Product;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 10:12
 */
public class Client {

    public static void main(String[] args) {
        Factory factory = new ConcreteFactoryA();
        factory.doSomething();
        Product product = factory.factoryMethod();
        // ...
    }

}
