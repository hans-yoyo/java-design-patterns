package com.hyman.state.example.bank;

/**
 * @author HuHan
 * @description
 * @date 2020/01/03 16:12
 */
public abstract class AccountState {
    protected Account account;

    // 存
    public abstract void deposit(double amount);

    // 取
    public abstract void withdraw(double amount);

    // 计算利息
    public abstract void computeInterest();

    // 状态检查
    public abstract void stateCheck();
}
