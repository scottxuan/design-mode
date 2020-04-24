package com.scottxuan.structure.decorator;

/**
 * @author : zhaoxuan
 */
public class CameraThinFaceDecorator extends CameraDecorator {
    public CameraThinFaceDecorator(Camera notice) {
        super(notice);
    }

    @Override
    void beauty() {
        super.beauty();
        thinFace();
    }

    public void thinFace(){
        System.out.println("瘦脸");
    }
}
