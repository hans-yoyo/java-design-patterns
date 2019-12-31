package com.hyman.prototype.weeklylog;

import lombok.Getter;
import lombok.Setter;

import java.io.*;

/**
 * @author HuHan
 * @description
 * @date 2019/12/31 14:19
 */
@Getter
@Setter
public class WeeklyLogDeepClone implements Serializable {

    private String name;
    private String date;
    private String content;
    private Attachment attachment;

    public WeeklyLogDeepClone cloneSelf() throws IOException, ClassNotFoundException {
        //将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        //将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (WeeklyLogDeepClone) ois.readObject();
    }
}
