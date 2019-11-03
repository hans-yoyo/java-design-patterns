package com.hyman.chain.basic;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 14:06
 */
@Data
@AllArgsConstructor
public class LeaveRequest {
    // 请假人姓名
    private String name;
    private Integer numOfDays;
}
