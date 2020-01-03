package com.hyman.chain.basic;

/**
 * @author HuHan
 * @description
 * @date 2020/01/02 16:50
 */
public abstract class Handler {

    // 维持对下家的引用
    protected Handler successor;

    public void setSuccessor(Handler handler) {
        this.successor = handler;
    }

    public abstract void handleRequest(String request);

}
