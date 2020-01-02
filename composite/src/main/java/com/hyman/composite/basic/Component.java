package com.hyman.composite.basic;

/**
 * @author HuHan
 * @description
 * @date 2020/01/02 10:26
 */
public abstract class Component {
    abstract void add(Component c);

    abstract void remove(Component c);

    abstract Component getChild(int i);

    abstract void operation(); // 业务方法

}
