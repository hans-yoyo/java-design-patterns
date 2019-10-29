package com.hyman.singleton.basic;

/**
 * @author HuHan
 * @description 饿汉式
 * 在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以是线程安全的，
 * @date 2019/10/29 14:53
 */
public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
