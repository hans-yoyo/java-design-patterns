package com.hyman.memento.basic;

import lombok.Getter;
import lombok.Setter;

/**
 * @author HuHan
 * @description 原发器类
 * @date 2020/01/03 14:49
 */
@Getter
@Setter
class Originator {

    private String state;

    public Originator() {
    }

    // 创建一个备忘录对象
    public Memento createMemento() {
        return new Memento(this);
    }

    // 根据备忘录对象恢复原发器状态
    public void restoreMemento(Memento memento) {
        state = memento.getState();
    }

}
