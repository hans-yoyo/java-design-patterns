package com.hyman.factory.example.abstractfactory;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/17 21:51
 * @version： 1.0.0
 */
public class Factory1 extends AbstractoryFactory1 {
    @Override
    ICarB getProductBBenz() {
        return new ProductSportBBenz();
    }

    @Override
    ICarB getProductBAudi() {
        return new ProducSporttBAudi();
    }
}
