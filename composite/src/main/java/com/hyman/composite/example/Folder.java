package com.hyman.composite.example;

import java.util.ArrayList;

/**
 * @author HuHan
 * @description
 * @date 2020/01/02 10:41
 */
public class Folder extends AbstractFile {

    private String name;

    private ArrayList<AbstractFile> fileList = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");  //模拟杀毒
        for (AbstractFile file : fileList) {
            file.killVirus();
        }
    }
}
