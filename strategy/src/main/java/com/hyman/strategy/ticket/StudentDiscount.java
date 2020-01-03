package com.hyman.strategy.ticket;

/**
 * @author HuHan
 * @description
 * @date 2020/01/03 16:44
 */
public class StudentDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("学生票...");
        return price * 0.8;
    }
}
