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
public class ChessmanMemento {
    private String label;
    private int x;
    private int y;
}
