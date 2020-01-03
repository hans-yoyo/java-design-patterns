package com.hyman.chain.example.purchase;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author HuHan
 * @description
 * @date 2020/01/02 16:57
 */
@Getter
@Setter
@AllArgsConstructor
public class PurchaseRequest {
    private double amount;  //采购金额
    private int number;  //采购单编号
    private String purpose;  //采购目的
}
