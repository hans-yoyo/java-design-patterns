package com.hyman.chain.basic;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 14:18
 */
public class Client {

    public static void main(String[] args) {
        Handler zhangsan = new DirectorHandler("张三");
        Handler lisi = new ManagerHandler("李四");
        Handler wangwu = new TopManagerHandler("王五");

        // 创建责任链
        zhangsan.setNextHandler(lisi);
        lisi.setNextHandler(wangwu);

        // 发起请假申请
        boolean result1 = zhangsan.process(new LeaveRequest("小旋锋", 1));
        System.out.println("最终结果：" + result1 + "\n");

        boolean result2 = zhangsan.process(new LeaveRequest("小旋锋", 4));
        System.out.println("最终结果：" + result2 + "\n");

        boolean result3 = zhangsan.process(new LeaveRequest("小旋锋", 8));
        System.out.println("最终结果：" + result3 + "\n");
    }

}
