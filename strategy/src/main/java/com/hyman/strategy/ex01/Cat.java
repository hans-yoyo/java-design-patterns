package com.hyman.strategy.ex01;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/20 22:05
 * @version： 1.0.0
 */
public class Cat implements MyComparable {

    private Integer weight;

    private Integer height;

    static MyComparator comparator = new CatHeightComparator();

    public Cat(Integer weight, Integer height) {
        this.weight = weight;
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public static MyComparator getComparator() {
        return comparator;
    }

    public static void setComparator(MyComparator comparator) {
        Cat.comparator = comparator;
    }

    public int compareTo(MyComparable c) {
        return comparator.compare(this, c);
    }
}
