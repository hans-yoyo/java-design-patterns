package com.hyman.singleton.basic;

/**
 * @author HuHan
 * @description 懒汉式: 类加载时没有生成单例，只有当第一次调用 getlnstance 方法时才去创建这个单例
 * 每次访问时都要同步，会影响性能，且消耗更多的资源
 * @date 2019/10/29 14:53
 */
public class LazySingleton {

    private static volatile LazySingleton instance = null;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
