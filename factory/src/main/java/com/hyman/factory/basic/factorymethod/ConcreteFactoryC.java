package com.hyman.factory.basic.factorymethod;

import com.hyman.factory.basic.simplefactory.ConcreteProductA;
import com.hyman.factory.basic.simplefactory.ConcreteProductC;
import com.hyman.factory.basic.simplefactory.Product;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 10:32
 */
public class ConcreteFactoryC extends Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProductC();
    }
}
