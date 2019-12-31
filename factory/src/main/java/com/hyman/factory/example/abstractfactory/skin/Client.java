package com.hyman.factory.example.abstractfactory.skin;

/**
 * @author HuHan
 * @description
 * @date 2019/12/31 11:22
 */
public class Client {

    public static void main(String[] args) {
        SkinFactory factory = new SpringSkinFactory();
        Button button = factory.createButton();
        TextField textField = factory.createTextField();
        ComboBox comboBox = factory.createComboBox();
        button.display();
        textField.display();
        comboBox.display();
    }

}
