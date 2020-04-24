package com.scottxuan.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhaoxuan
 */
public class Folder implements IFile {
    List<IFile> fileList = new ArrayList<IFile>();

    @Override
    public void add(IFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(IFile file) {
        fileList.remove(file);
    }

    @Override
    public IFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("文件夹进行杀毒..........");
        for (IFile iFile : fileList) {
            iFile.killVirus();
        }
    }
}
