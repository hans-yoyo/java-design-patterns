package com.hyman.bridge.example;

/**
 * @author HuHan
 * @description Unix操作系统实现类：具体实现类
 * @date 2019/12/31 16:40
 */
public class UnixImageImpl implements ImageImpl {
    @Override
    public void doPaint(Matrix matrix) {
        System.out.print("在Unix操作系统中显示图像：");
    }
}
