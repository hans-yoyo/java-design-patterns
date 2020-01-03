package com.hyman.command.example.logger;

import java.io.Serializable;

/**
 * @author HuHan
 * @description 抽象命令类
 * @date 2020/01/03 10:12
 */
public abstract class Command implements Serializable {

    protected String name; //命令名称
    protected String args; //命令参数
    protected ConfigOperator configOperator; //维持对接收者对象的引用

    public Command(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConfigOperator(ConfigOperator configOperator) {
        this.configOperator = configOperator;
    }

    //声明两个抽象的执行方法execute()
    public abstract void execute(String args);

    public abstract void execute();
}
