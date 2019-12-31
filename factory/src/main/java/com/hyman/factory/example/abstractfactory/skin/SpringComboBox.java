package com.hyman.factory.example.abstractfactory.skin;

/**
 * @author HuHan
 * @description
 * @date 2019/12/31 11:16
 */
public class SpringComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示绿色边框组合框...");
    }
}
