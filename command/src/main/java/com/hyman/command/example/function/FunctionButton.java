package com.hyman.command.example.function;

/**
 * @author HuHan
 * @description
 * @date 2020/01/02 22:34
 */
public class FunctionButton {

    private String name;// 功能键名称
    private Command command;// 维持一个抽象命令对象的引用

    public FunctionButton(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void onClick() {
        System.out.println("点击功能键...");
        command.execute();
    }
}
