package com.hyman.factory.basic.factorymethod.logger;

/**
 * @author HuHan
 * @description
 * @date 2019/12/31 10:30
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件记录日志...");
    }
}
