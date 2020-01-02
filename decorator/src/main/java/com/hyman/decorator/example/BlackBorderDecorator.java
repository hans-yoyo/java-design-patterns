package com.hyman.decorator.example;

/**
 * @author HuHan
 * @description 具体装饰类
 * @date 2020/01/02 11:43
 */
public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder() {
        System.out.println("为构件增加黑色边框！");
    }

}
