package com.hyman.proxy.example;

import com.hyman.proxy.example.example.*;

/**
 * @author HuHan
 * @description 动态代理 - 统一预处理，使用统一的代理类  ||  局限性：如果被代理的类未实现任何接口，那么不能采用通过InvocationHandler动态代理的方式去代理它的行为
 * @date 2019/10/31 17:28
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        IDeveloper jerry = new Developer("Jerry");
        Tester tester = new Tester("Jack");

        IDeveloper jerryProxy = (IDeveloper) new EngineerProxy().bind(jerry);
        jerryProxy.writeCode();

        ITester jackProxy = (ITester) new EngineerProxy().bind(tester);
        jackProxy.doTesting();

        System.out.println("------------报错-----------------");

        ProductOwner po = new ProductOwner("Ross");
        ProductOwner poProxy = (ProductOwner) new EngineerProxy().bind(po);
        poProxy.defineBackLog();

    }

}
