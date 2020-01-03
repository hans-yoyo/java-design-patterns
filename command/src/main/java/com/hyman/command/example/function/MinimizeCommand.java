package com.hyman.command.example.function;

/**
 * @author HuHan
 * @description
 * @date 2020/01/02 22:29
 */
public class MinimizeCommand extends Command {

    private WindowHandler handler;

    public MinimizeCommand() {
        handler = new WindowHandler();
    }

    @Override
    public void execute() {
        handler.minimize();
    }
}
