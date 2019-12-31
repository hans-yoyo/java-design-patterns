package com.hyman.factory.example.abstractfactory.skin;

/**
 * @author HuHan
 * @description
 * @date 2019/12/31 11:14
 */
public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示浅蓝色边框文本框...");
    }
}
