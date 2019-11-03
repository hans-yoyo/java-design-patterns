package com.hyman.prototype;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 11:38
 */
public class Client {
    public static void main(String[] args) {
        ProtoType protoType = new ConcretePrototype("awe");
        ProtoType myClone = protoType.myClone();
        System.out.println(myClone.toString());
    }
}
