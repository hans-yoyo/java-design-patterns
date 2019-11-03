package com.hyman.command.basic;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 15:19
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
