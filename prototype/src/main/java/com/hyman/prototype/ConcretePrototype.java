package com.hyman.prototype;

/**
 * @author HuHan
 * @description
 * @date 2019/10/31 11:35
 */
public class ConcretePrototype extends ProtoType {
    private String field;

    public ConcretePrototype(String field) {
        this.field = field;
    }

    @Override
    ProtoType myClone() {
        return new ConcretePrototype(field);
    }

    @Override
    public String toString() {
        return field;
    }
}
