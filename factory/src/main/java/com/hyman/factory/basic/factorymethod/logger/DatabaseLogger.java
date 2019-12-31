package com.hyman.factory.basic.factorymethod.logger;

/**
 * @author HuHan
 * @description
 * @date 2019/12/31 10:30
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库记录日志...");
    }
}
