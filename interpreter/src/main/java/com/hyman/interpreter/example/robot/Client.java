package com.hyman.interpreter.example.robot;

/**
 * @author HuHan
 * @description
 * @date 2020/01/03 11:47
 */
public class Client {

    public static void main(String args[]) {
        String instruction = "up move 5 and down run 10 and left move 5";
        InstructionHandler handler = new InstructionHandler();
        handler.handle(instruction);
        String outString;
        outString = handler.output();
        System.out.println(outString);
    }

}
