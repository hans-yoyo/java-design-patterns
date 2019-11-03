package com.hyman.proxy.example.example;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 17:11
 */
public class Tester implements ITester {

    private String name;

    public Tester(String name) {
        this.name = name;
    }

    @Override
    public void doTesting() {
        System.out.println("Tester " + name + " is testing code");
    }
}
