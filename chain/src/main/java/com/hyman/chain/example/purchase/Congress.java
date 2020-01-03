package com.hyman.chain.example.purchase;

/**
 * @author HuHan
 * @description
 * @date 2020/01/02 17:00
 */
public class Congress extends Approver {
    public Congress(String name) {
        super(name);
    }

    //具体请求处理方法
    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("召开董事会审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");        //处理请求
    }
}
