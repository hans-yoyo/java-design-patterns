package com.hyman.proxy.example.basic;

/**
 * @author HuHan
 * @description 代理
 * @date 2019/10/31 16:40
 */
public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void postRequest() {
        System.out.println("执行postRequest 方法");
    }

    private void preRequest() {
        System.out.println("执行preRequest 方法");
    }


}
