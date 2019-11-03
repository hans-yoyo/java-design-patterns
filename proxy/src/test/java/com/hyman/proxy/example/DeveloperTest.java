package com.hyman.proxy.example;

import com.hyman.proxy.example.example.*;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 17:01
 */
public class DeveloperTest {

    public static void main(String[] args) {
        IDeveloper jerry = new Developer("Jerry");
        jerry.writeCode();

        System.out.println("-----------使用代理模式-------------");

        IDeveloper jerryProxy = new DeveloperProxy(jerry);
        jerryProxy.writeCode();

        System.out.println("-----------多一个Tester，多一套代理-------------");
        ITester testerProxy = new TesterProxy(new Tester("Jack"));
        testerProxy.doTesting();
    }

}
