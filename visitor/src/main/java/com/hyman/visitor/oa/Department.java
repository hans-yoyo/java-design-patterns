package com.hyman.visitor.oa;

/**
 * @author HuHan
 * @description
 * @date 2020/01/03 17:54
 */
public abstract class Department {
    public abstract void visit(ParttimeEmployee parttimeEmployee);

    public abstract void visit(FulltimeEmployee fulltimeEmployee);
}
