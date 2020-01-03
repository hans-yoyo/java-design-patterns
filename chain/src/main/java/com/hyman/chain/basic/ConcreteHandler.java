package com.hyman.chain.basic;

import java.util.Random;

/**
 * @author HuHan
 * @description
 * @date 2020/01/02 16:51
 */
public class ConcreteHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        int random = new Random().nextInt(10);
        if (random > 5) {
            //处理请求
        } else {
            this.successor.handleRequest(request);  //转发请求
        }

    }
}
