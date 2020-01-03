package com.hyman.template.bank;

/**
 * @author HuHan
 * @description
 * @date 2020/01/03 17:22
 */
public class CurrentAccount extends Account {
    @Override
    public void calculateInterest() {
        System.out.println("活期利率计算利息");
    }
}
