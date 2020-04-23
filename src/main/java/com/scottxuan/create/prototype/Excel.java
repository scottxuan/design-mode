package com.scottxuan.create.prototype;

public class Excel implements File {
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
        System.out.println("Excel文件");
    }
}
