package com.scottxuan.create.prototype.deep;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.*;

/**
 * @author : zhaoxuan
 * @date : 2020/4/23
 */
@AllArgsConstructor
@Getter
public class Computer implements Serializable,Cloneable {
    private CPU cpu;
    private VideoCard videoCard;
    private Memory memory;

    protected Computer deepClone() throws IOException, ClassNotFoundException {
        //将对象写入流中
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bao);
        oos.writeObject(this);
        //将对象从流中取出
        ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return (Computer)ois.readObject();
    }
}
