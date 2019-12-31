package com.hyman.factory.example.abstractfactory.skin;

/**
 * @author HuHan
 * @description
 * @date 2019/12/31 11:17
 */
public class SummerComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示浅蓝色边框组合框...");
    }
}
