package com.hyman.chain.example.purchase;

/**
 * @author HuHan
 * @description 抽象处理者
 * @date 2020/01/02 16:58
 */
public abstract class Approver {

    protected Approver successor; // 后续处理者
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    //抽象请求处理方法
    public abstract void processRequest(PurchaseRequest request);

}
