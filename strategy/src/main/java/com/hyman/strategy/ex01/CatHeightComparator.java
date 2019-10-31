package com.hyman.strategy.ex01;

/**
 * @Description: 身高升序
 * @author: Hyman
 * @date: 2019/05/20 22:08
 * @version： 1.0.0
 */
public class CatHeightComparator implements MyComparator {

    public int compare(MyComparable c1, MyComparable c2) {
        if (((Cat) c1).getHeight() > ((Cat) c2).getHeight()) {
            return 1;
        } else if (((Cat) c1).getHeight() < ((Cat) c2).getHeight()) {
            return -1;
        } else {
            return 0;
        }
    }
}
