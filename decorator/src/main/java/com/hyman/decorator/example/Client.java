package com.hyman.decorator.example;

/**
 * @author HuHan
 * @description
 * @date 2020/01/02 11:47
 */
public class Client {

    public static void main(String[] args) {
        Component component, componentSB;
        component = new TextBox();
        componentSB = new BlackBorderDecorator(component);
        componentSB.display();
    }

}
