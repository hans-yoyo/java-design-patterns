package com.hyman.bridge.example;

/**
 * @author HuHan
 * @description 抽象图像类：抽象类
 * @date 2019/12/31 16:35
 */
public abstract class Image {

    protected ImageImpl imageImpl;

    public void setImageImpl(ImageImpl imageImpl) {
        this.imageImpl = imageImpl;
    }

    public abstract void parseFile(String fileName);

}
