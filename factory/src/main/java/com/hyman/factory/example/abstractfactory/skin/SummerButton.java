package com.hyman.factory.example.abstractfactory.skin;

/**
 * @author HuHan
 * @description
 * @date 2019/12/31 11:12
 */
public class SummerButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮...");
    }
}
