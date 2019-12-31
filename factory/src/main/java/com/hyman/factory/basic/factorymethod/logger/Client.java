package com.hyman.factory.basic.factorymethod.logger;

/**
 * @author HuHan
 * @description
 * @date 2019/12/31 10:33
 */
public class Client {

    public static void main(String[] args) {
        LoggerFactory factory = new FileLoggerFactory();
        Logger logger = factory.createLogger();
        logger.writeLog();
    }

}
