package com.hyman.strategy.ex01;

/**
 * @Description: 体重倒序
 * @author: Hyman
 * @date: 2019/05/20 22:12
 * @version： 1.0.0
 */
public class CatWeightComparator implements MyComparator {

    public int compare(MyComparable c1, MyComparable c2) {
        if (((Cat) c1).getWeight() > ((Cat) c2).getWeight()) {
            return -1;
        } else if (((Cat) c1).getWeight() < ((Cat) c2).getWeight()) {
            return 1;
        } else {
            return 0;
        }
    }
}
