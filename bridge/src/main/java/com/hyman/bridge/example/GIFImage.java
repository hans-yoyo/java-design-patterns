package com.hyman.bridge.example;

/**
 * @author HuHan
 * @description
 * @date 2019/12/31 16:48
 */
public class GIFImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        imageImpl.doPaint(matrix);
        System.out.println(fileName + "，格式为GIF。");
    }
}
