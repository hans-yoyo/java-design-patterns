package com.hyman.proxy.example.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 17:21
 */
public class EngineerProxy implements InvocationHandler {

    Object object;

    public Object bind(Object object) {
        this.object = object;
        return Proxy.newProxyInstance(this.object.getClass().getClassLoader(), this.object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Engineer writes documents");
        Object res = method.invoke(object, args);
        return res;
    }
}
