package com.hyman.proxy.example.example;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 17:43
 */
public class EngineerCGLibProxy {

    Object targetObject;

    public Object bind(final Object target) {
        this.targetObject = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetObject.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("Enginner 2 writes document");
                Object res = method.invoke(target, args);
                return res;
            }
        });
        return enhancer.create();
    }

}
