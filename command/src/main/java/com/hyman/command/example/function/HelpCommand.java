package com.hyman.command.example.function;

/**
 * @author HuHan
 * @description
 * @date 2020/01/02 22:29
 */
public class HelpCommand extends Command {

    private HelpHandler handler;

    public HelpCommand() {
        handler = new HelpHandler();
    }

    @Override
    public void execute() {
        handler.display();
    }
}
