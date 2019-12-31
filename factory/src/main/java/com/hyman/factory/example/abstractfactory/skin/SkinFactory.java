package com.hyman.factory.example.abstractfactory.skin;

/**
 * @author HuHan
 * @description
 * @date 2019/12/31 11:18
 */
public interface SkinFactory {
    public Button createButton();
    public TextField createTextField();
    public ComboBox createComboBox();
}
