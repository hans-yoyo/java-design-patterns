package com.hyman.proxy.example;

import com.hyman.proxy.example.example.EngineerCGLibProxy;
import com.hyman.proxy.example.example.ProductOwner;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 17:51
 */
public class CGLibProxyTest {

    public static void main(String[] args) {
        ProductOwner ross = new ProductOwner("Ross");
        ProductOwner rossProxy = (ProductOwner) new EngineerCGLibProxy().bind(ross);
        rossProxy.defineBackLog();
    }

}
