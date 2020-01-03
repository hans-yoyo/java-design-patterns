package com.hyman.command.basic;

/**
 * @author HuHan
 * @description
 * @date 2020/01/02 22:05
 */
public class ConcreteCommand extends Command {

    //维持一个对请求接收者对象的引用
    private Receiver receiver;

    @Override
    public void execute() {
        receiver.action();
    }
}
