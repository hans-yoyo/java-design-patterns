package com.hyman.template.bank;

/**
 * @author HuHan
 * @description
 * @date 2020/01/03 17:23
 */
public class Client {

    public static void main(String[] args) {
        Account account = new SavingAccount();
        account.handle("hyman", "123456");
    }

}
