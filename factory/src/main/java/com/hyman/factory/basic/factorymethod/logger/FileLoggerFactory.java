package com.hyman.factory.basic.factorymethod.logger;

/**
 * @author HuHan
 * @description
 * @date 2019/12/31 10:33
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        //创建文件，代码省略
        return logger;
    }
}
