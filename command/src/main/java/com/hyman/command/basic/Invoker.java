package com.hyman.command.basic;

/**
 * @author HuHan
 * @description
 * @date 2020/01/02 22:02
 */
public class Invoker {

    private Command command;

    // 构造注入
    public Invoker(Command command) {
        this.command = command;
    }

    // 设置注入
    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        command.execute();
    }

}
