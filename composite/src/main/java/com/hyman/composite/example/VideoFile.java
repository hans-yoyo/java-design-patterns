package com.hyman.composite.example;

import lombok.AllArgsConstructor;

/**
 * @author HuHan
 * @description
 * @date 2020/01/02 10:41
 */
@AllArgsConstructor
public class VideoFile extends AbstractFile {

    private String name;

    @Override
    public void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法！");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("----对视频文件'" + name + "'进行杀毒");
    }
}
