package com.hyman.factory.basic.methodfactory;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/16 22:03
 * @version： 1.0.0
 */
public class MyMessageSms extends MyAbstractMessage {
    public void sendMesage() throws Exception {
        if (null == getMessageParam()
                || null == getMessageParam().get("PHONENUM")
                || "".equals(getMessageParam().get("PHONENUM"))) {
            throw new Exception("发送短信,需要传入PHONENUM参数");
        }

        System.out.println("我是短信，发送通知给" + getMessageParam().get("PHONENUM"));
    }
}
