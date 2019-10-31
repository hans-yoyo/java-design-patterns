package com.hyman.strategy.ex01;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/20 22:17
 * @version： 1.0.0
 */
public class Test {

    public static void main(String[] args) {
        // 按体重倒序策略排序
        Cat.setComparator(new CatWeightComparator());
        // 默认身高升序策略排序
        MyComparable[] c = new Cat[]{new Cat(4, 6), new Cat(6, 4), new Cat(5, 3), new Cat(3, 5)};
        DataSort.sort(c);
        DataSort.print(c);
    }

}
