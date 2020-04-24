package com.scottxuan.structure.composite;

/**
 * @author : zhaoxuan
 */
public  interface IFile {
    default void add(IFile file){
        System.out.println("不支持添加");
    }
    default void remove(IFile file){
        System.out.println("不支持移除");
    }
    default IFile getChild(int i){
        System.out.println("不支持子节点获取");
        return null;
    }
    void killVirus();
}
