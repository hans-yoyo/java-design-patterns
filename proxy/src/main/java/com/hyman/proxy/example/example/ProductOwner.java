package com.hyman.proxy.example.example;

import lombok.Getter;
import lombok.Setter;

/**
 * @author HuHan
 * @description 使用CGLib的实际类，不能被申明为final
 * @date 2019/10/31 17:40
 */
@Getter
@Setter
public class ProductOwner {

    private String name;

    public ProductOwner(String name) {
        this.name = name;
    }

    public ProductOwner() {
    }

    public void defineBackLog() {
        System.out.println("PO: " + name + " defines Backlog.");
    }

}
