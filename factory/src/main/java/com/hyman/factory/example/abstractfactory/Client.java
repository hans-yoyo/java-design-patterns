package com.hyman.factory.example.abstractfactory;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/17 21:53
 * @version： 1.0.0
 */
public class Client {

    public static void main(String[] args) {
        //工厂一制造的产品族车
        AbstractoryFactory1 factory1 = new Factory1();
        ICarB productsportBbenz = factory1.getProductBBenz();
        ICarB productsportBaudi = factory1.getProductBAudi();

        productsportBbenz.drive();
        productsportBaudi.drive();



        //工厂二制造的产品族车
        AbstractoryFactory2 factory2 = new Factory2();
        ICarA productAbmw = factory2.getProductABmw();
        ICarA productAhongqi = factory2.getProductAHongqi();
        productAbmw.drive();
        productAhongqi.drive();

    }

}
