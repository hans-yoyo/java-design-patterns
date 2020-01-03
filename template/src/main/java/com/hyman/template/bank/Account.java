package com.hyman.template.bank;

/**
 * @author HuHan
 * @description
 * @date 2020/01/03 17:16
 */
public abstract class Account {

    // 步骤1
    public boolean validate(String account, String password) {
        System.out.println("账户名：" + account + ", 密码：" + password);
        return ("hyman".equalsIgnoreCase(account) && "123456".equals(password));
    }

    // 步骤2
    public abstract void calculateInterest();

    // 步骤3
    public void display() {
        System.out.println("显示利息...");
    }

    // 模版方法
    public void handle(String account, String password) {
        if (!validate(account, password)) {
            System.out.println("账户或密码错误");
            return;
        }
        calculateInterest();
        display();
    }

}
