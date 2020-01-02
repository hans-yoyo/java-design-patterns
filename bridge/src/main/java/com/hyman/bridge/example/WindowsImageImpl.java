package com.hyman.bridge.example;

/**
 * @author HuHan
 * @description Windows操作系统实现类：具体实现类
 * @date 2019/12/31 16:40
 */
public class WindowsImageImpl implements ImageImpl {
    @Override
    public void doPaint(Matrix matrix) {
        System.out.print("在Windows操作系统中显示图像：");
    }
}
