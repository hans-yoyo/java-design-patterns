package com.hyman.command.example.logger;

/**
 * @author HuHan
 * @description 配置文件操作类，命令接收者
 * @date 2020/01/03 10:14
 */
public class ConfigOperator {
    public void insert(String args) {
        System.out.println("增加新节点：" + args);
    }

    public void modify(String args) {
        System.out.println("修改节点：" + args);
    }

    public void delete(String args) {
        System.out.println("删除节点：" + args);
    }
}
