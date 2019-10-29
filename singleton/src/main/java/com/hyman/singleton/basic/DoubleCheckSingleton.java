package com.hyman.singleton.basic;

/**
 * @author HuHan
 * @description 双重检查
 * @date 2019/10/29 15:04
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        // 先检查实例是否存在，如果不存在才进入下面的同步块
        if (instance == null) {
            // 同步块，线程安全的创建实例
            synchronized (DoubleCheckSingleton.class) {
                // 再次检查实例是否存在，如果不存在才真正的创建实例
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

}
