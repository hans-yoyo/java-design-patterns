package com.hyman.proxy.example.example;

import lombok.Getter;
import lombok.Setter;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 16:59
 */
@Getter
@Setter
public class DeveloperProxy implements IDeveloper {

    private IDeveloper developer;

    public DeveloperProxy(IDeveloper developer) {
        this.developer = developer;
    }

    @Override
    public void writeCode() {
        System.out.println("Write documentation...");
        this.developer.writeCode();
    }

}
