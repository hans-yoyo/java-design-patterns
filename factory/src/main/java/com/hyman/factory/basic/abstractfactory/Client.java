package com.hyman.factory.basic.abstractfactory;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 10:55
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ConcreteFactory1();
        AbstractProductA productA = abstractFactory.createProductA();
        AbstractProductB productB = abstractFactory.createProductB();
        // ...
    }
}
