package com.scottxuan.structure.composite;

/**
 * @author : zhaoxuan
 */
public class TextFile implements IFile {
    @Override
    public void killVirus() {
        System.out.println("文本文件杀毒");
    }
}
