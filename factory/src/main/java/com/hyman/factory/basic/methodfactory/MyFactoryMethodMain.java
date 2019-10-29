package com.hyman.factory.basic.methodfactory;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/16 22:11
 * @version： 1.0.0
 */
public class MyFactoryMethodMain {
    public static void main(String[] args) {
        IMyMessageFactory myMessageFactory = new MyMessageFactory();
        IMyMessage myMessage;
        // 对于这个消费者来说，不用知道如何生产message这个产品，耦合度降低
        try {
            // 先来一个短信通知
            myMessage = myMessageFactory.createMessage(MessageType.SMS);
            myMessage.sendMesage();

            // 来一个oa待办
            myMessage = myMessageFactory.createMessage(MessageType.OA);
            myMessage.sendMesage();

            // 来一个邮件通知
            myMessage = myMessageFactory.createMessage(MessageType.EMAIL);
            myMessage.sendMesage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
