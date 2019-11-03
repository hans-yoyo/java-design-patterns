package com.hyman.proxy.example.example;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 17:12
 */
public class TesterProxy implements ITester {

    private ITester tester;

    public TesterProxy(ITester tester) {
        this.tester = tester;
    }

    @Override
    public void doTesting() {
        System.out.println("Tester is preparing test documentation...");
        tester.doTesting();
    }
}
