package com.scottxuan.structure.composite;

/**
 * @author : zhaoxuan
 * @date : 2020/4/24
 */
public class TextFile implements IFile {
    @Override
    public void killVirus() {
        System.out.println("文本文件杀毒");
    }
}
