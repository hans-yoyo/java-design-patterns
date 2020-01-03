package com.hyman.visitor.oa;

/**
 * @author HuHan
 * @description
 * @date 2020/01/03 17:53
 */
public interface Employee {
    void accept(Department handler);
}
