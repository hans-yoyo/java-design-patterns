package com.hyman.flyweight.example;

import java.util.Hashtable;

/**
 * @author HuHan
 * @description
 * @date 2020/01/02 14:23
 */
public class IgoChessmanFactory {

    private static IgoChessmanFactory instance = new IgoChessmanFactory();

    private static Hashtable<String, IgoChessman> ht;

    private IgoChessmanFactory() {
        ht = new Hashtable();
        IgoChessman black, white;
        black = new BlackIgoChessman();
        ht.put("b", black);
        white = new WhiteIgoChessman();
        ht.put("w", white);
    }

    // 单例
    public static IgoChessmanFactory getInstance() {
        return instance;
    }

    //通过key来获取存储在Hashtable中的享元对象
    public static IgoChessman getIgoChessman(String color) {
        return ht.get(color);
    }


}
