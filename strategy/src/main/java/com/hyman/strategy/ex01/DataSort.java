package com.hyman.strategy.ex01;

/**
 * @Description:
 * @author: Hyman
 * @date: 2019/05/20 22:20
 * @version： 1.0.0
 */
public class DataSort {

    public static void sort(MyComparable[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void swap(MyComparable[] arr, int j, int i) {
        MyComparable object = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = object;
    }

    public static void print(MyComparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
