package com.hyman.factory.example.abstractfactory.skin;

/**
 * @author HuHan
 * @description
 * @date 2019/12/31 11:13
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示绿色边框文本框...");
    }
}
