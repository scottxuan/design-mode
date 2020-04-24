package com.scottxuan.structure.composite;

/**
 * @author : zhaoxuan
 */
public class ImageFile implements IFile {
    @Override
    public void killVirus() {
        System.out.println("图片文件杀毒");
    }
}
