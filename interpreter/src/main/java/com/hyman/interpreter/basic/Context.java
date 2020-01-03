package com.hyman.interpreter.basic;

import java.util.HashMap;

/**
 * @author HuHan
 * @description 环境类Context，用于存储一些全局信息，通常在Context中包含了一个HashMap或ArrayList等类型的集合对象，
 * 存储一系列公共信息，如变量名与值的映射关系（key/value）等，用于在进行具体的解释操作时从中获取相关信息
 * @date 2020/01/03 11:08
 */
public class Context {
    private HashMap map = new HashMap();

    public void assign(String key, String value) {
        //往环境类中设值
    }

    public String lookup(String key) {
        //获取存储在环境类中的值
        return "";
    }

}
