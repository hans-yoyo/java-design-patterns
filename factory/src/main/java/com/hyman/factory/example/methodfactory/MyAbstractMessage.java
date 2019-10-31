package com.hyman.factory.example.methodfactory;

import java.util.Map;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/16 21:56
 * @version： 1.0.0
 */
public abstract class MyAbstractMessage implements IMyMessage {

    private Map<String, Object> messageParam;

    public Map<String, Object> getMessageParam() {
        return messageParam;
    }

    public void setMessageParam(Map<String, Object> messageParam) {
        this.messageParam = messageParam;
    }
}
