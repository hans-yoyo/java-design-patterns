package com.hyman.visitor.oa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author HuHan
 * @description
 * @date 2020/01/03 17:55
 */
@Getter
@Setter
@AllArgsConstructor
public class ParttimeEmployee implements Employee {

    private String name;
    private double hourWage;
    private int workTime;

    @Override
    public void accept(Department handler) {
        handler.visit(this); //调用访问者的访问方法
    }
}
