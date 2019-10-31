package com.hyman.factory.basic.factorymethod;

import com.hyman.factory.basic.simplefactory.Product;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 10:31
 */
public abstract class Factory {
    abstract public Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        // do something with the product
    }
}
