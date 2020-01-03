package com.hyman.memento.example.chess;

/**
 * @author HuHan
 * @description
 * @date 2020/01/03 15:02
 */
public class Client {

    public static void main(String[] args) {
        MementoCaretaker mementoCaretaker = new MementoCaretaker();
        Chessman chess = new Chessman("军", 1, 1);// 原发器
        display(chess);
        mementoCaretaker.setMemento(chess.save());// 保存状态
        chess.setY(3);
        display(chess);
        mementoCaretaker.setMemento(chess.save());
        display(chess);
        chess.setX(5);
        display(chess);
        System.out.println("******悔棋******");
        chess.restore(mementoCaretaker.getMemento()); //恢复状态
        display(chess);
    }

    private static void display(Chessman chess) {
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
    }

}
