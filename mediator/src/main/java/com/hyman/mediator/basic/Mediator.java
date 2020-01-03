package com.hyman.mediator.basic;

import java.util.ArrayList;

/**
 * @author HuHan
 * @description
 * @date 2020/01/03 14:31
 */
public abstract class Mediator {

    protected ArrayList<Colleague> colleagues;

    public void register(Colleague colleague) {
        colleagues.add(colleague);
    }

    public abstract void operation();

}
