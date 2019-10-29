package com.hyman.factory.basic.methodfactory;

/**
 * @Description: 工厂接口
 * @author: Hyman
 * @date: 2019/05/16 21:50
 * @version： 1.0.0
 */
public interface IMyMessageFactory {
    IMyMessage createMessage(MessageType type);
}
