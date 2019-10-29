package com.hyman.factory.basic.methodfactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/16 22:04
 * @version： 1.0.0
 */
public class MyMessageFactory implements IMyMessageFactory {

    public IMyMessage createMessage(MessageType type) {
        IMyMessage myMessage;
        Map<String, Object> messageParam = new HashMap<String, Object>();
        switch (type) {
            case SMS:
                myMessage = new MyMessageSms();
                messageParam.put("PHONENUM", "123456789");
                break;
            case OA:
                myMessage = new MyMessageOaTodo();
                messageParam.put("OAUSERNAME", "testUser");
                break;
            default:
                myMessage = new MyMessageEmail();
                messageParam.put("EMAIL", "test@test.com");
        }
        myMessage.setMessageParam(messageParam);
        return myMessage;
    }
}

enum MessageType {
    SMS,
    OA,
    EMAIL
}
