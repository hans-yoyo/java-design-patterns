package com.hyman.factory.basic.methodfactory;

import java.util.Map;

/**
 * @描述：产品接口
 * @Author：huhan
 * @Date: 2019/05/16 21:51
 */
public interface IMyMessage {
    Map<String, Object> getMessageParam();

    void setMessageParam(Map<String, Object> messageParam);

    void sendMesage() throws Exception;
}
