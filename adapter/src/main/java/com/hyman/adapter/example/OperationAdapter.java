package com.hyman.adapter.example;

/**
 * @author HuHan
 * @description 操作适配器：适配器
 * @date 2019/12/31 16:01
 */
public class OperationAdapter implements ScoreOperation {

    private QuickSort sortObject;// 定义适配者QuickSort对象
    private BinarySearch searchObject;// 定义适配者BinarySearch对象

    public OperationAdapter() {
        sortObject = new QuickSort();
        searchObject = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return sortObject.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return searchObject.binarySearch(array, key);
    }
}
