package com.hyman.chain.basic;

import java.util.Random;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 14:13
 */
public class TopManagerHandler extends Handler {

    public TopManagerHandler(String name) {
        super(name);
    }

    @Override
    public boolean process(LeaveRequest leaveRequest) {
        boolean result = (new Random().nextInt(10)) > 3; // 随机数大于3则为批准，否则不批准
        String log = "总经理<%s> 审批 <%s> 的请假申请，请假天数： <%d> ，审批结果：<%s> ";
        System.out.println(String.format(log, this.name, leaveRequest.getName(), leaveRequest.getNumOfDays(), result ? "批准" : "不批准"));

        if (!result) { // 总经理不批准
            return false;
        }
        return true;    // 总经理最后批准
    }
}
