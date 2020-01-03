package com.hyman.strategy.ticket;

/**
 * @author HuHan
 * @description
 * @date 2020/01/03 16:46
 */
public class VIPDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("VIP票...");
        return price * 0.5;
    }
}
