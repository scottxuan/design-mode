package com.scottxuan.structure.composite;

/**
 * @author : zhaoxuan
 * @date : 2020/4/24
 */
public class Test {
    public static void main(String[] args) {
        IFile imageFile = new ImageFile();
        IFile textFile = new TextFile();
        IFile folder = new Folder();
        IFile folder1 = new Folder();
        IFile folder2 = new Folder();
        folder.add(imageFile);
        folder.add(textFile);
        folder1.add(imageFile);
        folder1.add(textFile);
        folder.add(folder1);
        folder.add(folder2);
        folder.killVirus();
    }
}
