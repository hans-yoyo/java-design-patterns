package com.hyman.proxy.example.basic;

/**
 * @author HuHan
 * @description 真实主题
 * @date 2019/10/31 16:39
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("访问真实主题方法");
    }
}
