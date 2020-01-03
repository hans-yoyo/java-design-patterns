package com.hyman.memento.basic;

import lombok.Getter;
import lombok.Setter;

/**
 * @author HuHan
 * @description 备忘录类
 * @date 2020/01/03 14:50
 */
@Getter
@Setter
public class Memento {

    private String state;

    public Memento(Originator originator) {
        state = originator.getState();
    }

}
