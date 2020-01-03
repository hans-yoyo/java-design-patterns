package com.hyman.strategy.ticket;

/**
 * @author HuHan
 * @description
 * @date 2020/01/03 16:48
 */
public class Client {

    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();
        double originalPrice = 60.0;
        double currentPrice;

        movieTicket.setPrice(originalPrice);
        System.out.println("原始价为：" + originalPrice);
        System.out.println("---------------------------------");

        Discount discount = new VIPDiscount();
        movieTicket.setDiscount(discount);
        currentPrice = movieTicket.getPrice();
        System.out.println("折后价为：" + currentPrice);
    }

}
