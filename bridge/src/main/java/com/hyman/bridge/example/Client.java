package com.hyman.bridge.example;

/**
 * @author HuHan
 * @description
 * @date 2019/12/31 16:52
 */
public class Client {

    public static void main(String[] args) {
        Image image = new GIFImage();
        ImageImpl imageImpl = new WindowsImageImpl();
        image.setImageImpl(imageImpl);
        image.parseFile("小龙女");
    }

}
