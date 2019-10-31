package com.hyman.factory.example.methodfactory;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/16 21:59
 * @version： 1.0.0
 */
public class MyMessageEmail extends MyAbstractMessage {

    public void sendMesage() throws Exception {
        if (null == getMessageParam() || null == getMessageParam().get("EMAIL")
                || "".equals(getMessageParam().get("EMAIL"))) {
            throw new Exception("发送短信,需要传入EMAIL参数");
        }
        System.out.println("我是邮件，发送通知给" + getMessageParam().get("EMAIL"));
    }
}
