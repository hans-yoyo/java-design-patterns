package com.hyman.mediator.basic;

/**
 * @author HuHan
 * @description
 * @date 2020/01/03 14:33
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void operation() {
        ((Colleague)(colleagues.get(0))).method1(); //通过中介者调用同事类的方法
    }
}
