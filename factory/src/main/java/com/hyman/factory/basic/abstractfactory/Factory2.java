package com.hyman.factory.basic.abstractfactory;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/17 21:52
 * @version： 1.0.0
 */
public class Factory2 extends AbstractoryFactory2 {
    @Override
    ICarA getProductABmw() {
        return new ProductABmw();
    }

    @Override
    ICarA getProductAHongqi() {
        return new ProductAHongQi();
    }
}
