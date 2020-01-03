package com.hyman.state.example.bank;

/**
 * @author HuHan
 * @description
 * @date 2020/01/03 16:30
 */
public class Client {
    public static void main(String args[]) {
        Account acc = new Account("段誉", 0.0);
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.deposit(3000);
        acc.withdraw(4000);
        acc.withdraw(1000);
        acc.computeInterest();
    }
}
