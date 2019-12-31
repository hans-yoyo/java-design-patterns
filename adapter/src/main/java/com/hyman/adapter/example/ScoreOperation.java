package com.hyman.adapter.example;

/**
 * @author HuHan
 * @description 抽象成绩操作类：目标接口
 * @date 2019/12/31 16:01
 */
public interface ScoreOperation {

    int[] sort(int array[]); //成绩排序

    int search(int array[], int key); //成绩查找

}
