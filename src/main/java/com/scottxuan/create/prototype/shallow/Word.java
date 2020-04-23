package com.scottxuan.create.prototype.shallow;

public class Word implements File {
    public File clone() {
        File file = null;
        try {
            return (File)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
        }
        return file;
    }

    public void display() {
        System.out.println("Word文件");
    }
}
