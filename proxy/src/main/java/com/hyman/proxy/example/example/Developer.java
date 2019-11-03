package com.hyman.proxy.example.example;

import lombok.Getter;
import lombok.Setter;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 16:57
 */
@Getter
@Setter
public class Developer implements IDeveloper {

    private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void writeCode() {
        System.out.println("Developer " + name + " writes code");
    }
}
