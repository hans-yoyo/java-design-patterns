package com.hyman.chain.basic;

import lombok.Data;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 14:07
 */
@Data
public abstract class Handler {
    // 处理人姓名
    protected String name;

    // 下一个处理
    protected Handler nextHandler;

    public Handler(String name) {
        this.name = name;
    }

    public abstract boolean process(LeaveRequest leaveRequest);

}
