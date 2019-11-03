package com.hyman.chain.basic;

import java.util.Random;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 14:13
 */
public class ManagerHandler extends Handler {

    public ManagerHandler(String name) {
        super(name);
    }

    @Override
    public boolean process(LeaveRequest leaveRequest) {
        boolean result = (new Random().nextInt(10)) > 3; // 随机数大于3则为批准，否则不批准
        String log = "经理<%s> 审批 <%s> 的请假申请，请假天数： <%d> ，审批结果：<%s> ";
        System.out.println(String.format(log, this.name, leaveRequest.getName(), leaveRequest.getNumOfDays(), result ? "批准" : "不批准"));

        if (!result) {  // 不批准
            return false;
        } else if (leaveRequest.getNumOfDays() < 7) { // 批准且天数小于7
            return true;
        }
        return nextHandler.process(leaveRequest);   // 批准且天数大于等于7，提交给下一个处理者处理
    }
}
