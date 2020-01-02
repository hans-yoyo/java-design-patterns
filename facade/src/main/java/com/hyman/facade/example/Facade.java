package com.hyman.facade.example;

/**
 * @author HuHan
 * @description
 * @date 2020/01/02 12:57
 */
public class Facade {

    private SubSystemA systemA = new SubSystemA();
    private SubSystemB systemB = new SubSystemB();
    private SubSystemC systemC = new SubSystemC();

    public void operation() {
        systemA.operation();
        systemB.operation();
        systemC.operation();
    }


}
