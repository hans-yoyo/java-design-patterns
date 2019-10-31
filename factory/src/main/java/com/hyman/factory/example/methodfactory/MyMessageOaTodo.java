package com.hyman.factory.example.methodfactory;

/**
 * @Description: OA 代办
 * @author: Hyman
 * @date: 2019/05/16 22:01
 * @version： 1.0.0
 */
public class MyMessageOaTodo extends MyAbstractMessage {
    public void sendMesage() throws Exception {
        if (null == getMessageParam()
                || null == getMessageParam().get("OAUSERNAME")
                || "".equals(getMessageParam().get("OAUSERNAME"))) {
            throw new Exception("发送OA待办,需要传入OAUSERNAME参数");
        }

        System.out.println("我是OA待办，发送通知给" + getMessageParam().get("OAUSERNAME"));
    }
}
