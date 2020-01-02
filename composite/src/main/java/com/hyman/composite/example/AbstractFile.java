package com.hyman.composite.example;

/**
 * @author HuHan
 * @description 抽象构件
 * @date 2020/01/02 10:35
 */
public abstract class AbstractFile {
    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract AbstractFile getChild(int i);

    public abstract void killVirus();
}
