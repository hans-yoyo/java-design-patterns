package com.hyman.command.example.light;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 15:19
 */
public class LightOnCommand implements Command{

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }


    @Override
    public void execute() {
        light.on();
    }
}
