package com.hyman.factory.example.abstractfactory.skin;

/**
 * @author HuHan
 * @description
 * @date 2019/12/31 11:11
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅绿色按钮...");
    }
}
