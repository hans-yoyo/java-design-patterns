package com.hyman.iterator.example;

import java.util.List;

/**
 * @author HuHan
 * @description 具体聚合类
 * @date 2020/01/03 14:05
 */
public class ProductList extends AbstractObjectList {
    public ProductList(List<Object> objects) {
        super(objects);
    }

    // 实现创建迭代器对象的具体工厂方法
    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator();
    }
}
