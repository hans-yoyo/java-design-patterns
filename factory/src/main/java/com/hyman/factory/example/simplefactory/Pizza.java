package com.hyman.factory.example.simplefactory;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/16 20:44
 * @version： 1.0.0
 */
public abstract class Pizza {

    /**
     * 准备
     */
    abstract void prepare();

    /**
     * 烘培
     */
    abstract void bake();

    /**
     * 切
     */
    abstract void cut();

    /**
     * 打包
     */
    abstract void box();

}
