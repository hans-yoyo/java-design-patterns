package com.hyman.factory.basic.simplefactory;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 10:12
 */
public class Client {

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Product product = factory.createProduct(1);
        // ...
    }

}
