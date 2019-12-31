package com.hyman.prototype.weeklylog;

import java.io.IOException;

/**
 * @author HuHan
 * @description
 * @date 2019/12/31 14:23
 */
public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        WeeklyLogDeepClone log_previous = new WeeklyLogDeepClone();  //创建原型对象
        Attachment attachment = new Attachment();
        log_previous.setAttachment(attachment);
        log_previous.setName("张无忌");
        log_previous.setDate("第12周");
        log_previous.setContent("这周工作很忙，每天加班！");
        System.out.println("****周报****");
        System.out.println("周次：" + log_previous.getDate());
        System.out.println("姓名：" + log_previous.getName());
        System.out.println("内容：" + log_previous.getContent());
        System.out.println("--------------------------------");
        System.out.println("原周报对象：" + log_previous);
        System.out.println("原周报对象附件：" + log_previous.getAttachment());

        WeeklyLogDeepClone log_new;
        log_new = log_previous.cloneSelf(); //调用克隆方法创建克隆对象
        System.out.println("克隆的周报：" + log_new);
        System.out.println("克隆周报的附件：" + log_new.getAttachment());
        log_new.setDate("第13周");
        System.out.println("****周报****");
        System.out.println("周次：" + log_new.getDate());
        System.out.println("姓名：" + log_new.getName());
        System.out.println("内容：" + log_new.getContent());
    }

}
