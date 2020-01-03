package com.hyman.command.example.logger;

/**
 * @author HuHan
 * @description 具体命令类
 * @date 2020/01/03 10:14
 */
public class ModifyCommand extends Command {
    public ModifyCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.modify(args);
    }

    @Override
    public void execute() {
        configOperator.modify(this.args);
    }
}
