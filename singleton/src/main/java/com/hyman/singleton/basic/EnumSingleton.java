package com.hyman.singleton.basic;

/**
 * @author HuHan
 * @description
 * @date 2019/10/29 15:51
 */
public enum EnumSingleton {

    /**
     * 单例1
     */
    INSTANCE01,
    /**
     * 单例2
     */
    INSTANCE02;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
