package com.hyman.memento.example.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author HuHan
 * @description
 * @date 2020/01/03 15:00
 */
@Getter
@Setter
@AllArgsConstructor
public class Chessman {
    private String label;
    private int x;
    private int y;

    //保存状态
    public ChessmanMemento save() {
        return new ChessmanMemento(this.label, this.x, this.y);
    }

    //恢复状态
    public void restore(ChessmanMemento memento) {
        this.label = memento.getLabel();
        this.x = memento.getX();
        this.y = memento.getY();
    }
}
