package com.hyman.strategy.ticket;

/**
 * @author HuHan
 * @description
 * @date 2020/01/03 16:45
 */
public class ChildrenDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("儿童票...");
        return price - 10;
    }
}
