package com.hyman.flyweight.example;

/**
 * @author HuHan
 * @description 抽象享元类
 * @date 2020/01/02 14:19
 */
public abstract class IgoChessman {

    public abstract String getColor();

    public void display(Coordinates coord) {
        System.out.println("棋子颜色：" + this.getColor() + "，棋子位置：" + coord.getX() + "，" + coord.getY());
    }

}
