package com.hyman.iterator.example;

import java.util.List;

/**
 * @author HuHan
 * @description 具体迭代器
 * @date 2020/01/03 14:04
 */
public class ProductIterator implements AbstractIterator {

    private ProductList productList;
    private List products;
    private int cursor1; // 游标，记录正向遍历的位置
    private int cursor2; // 游标，记录逆向遍历的位置

    public ProductIterator(ProductList list) {
        this.productList = list;
        this.products = list.getObjects();
        cursor1 = 0;
        cursor2 = products.size() - 1;
    }

    @Override
    public void next() {
        if (cursor1 < products.size()) {
            cursor1++;
        }
    }

    @Override
    public boolean isLast() {
        return (cursor1 == products.size());
    }

    @Override
    public void previous() {
        if (cursor2 > -1) {
            cursor2--;
        }
    }

    @Override
    public boolean isFirst() {
        return (cursor2 == -1);
    }

    @Override
    public Object getNextItem() {
        return products.get(cursor1);
    }

    @Override
    public Object getPreviousItem() {
        return products.get(cursor2);
    }
}
