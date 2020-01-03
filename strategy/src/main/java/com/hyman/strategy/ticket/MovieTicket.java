package com.hyman.strategy.ticket;

/**
 * @author HuHan
 * @description
 * @date 2020/01/03 16:47
 */
public class MovieTicket {

    private double price;
    private Discount discount; // 维持一个对抽象折扣的引用

    public double getPrice() {
        return discount.calculate(price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
