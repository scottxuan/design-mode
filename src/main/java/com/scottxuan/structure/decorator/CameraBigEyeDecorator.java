package com.scottxuan.structure.decorator;

/**
 * @author : zhaoxuan
 */
public class CameraBigEyeDecorator extends CameraDecorator {
    public CameraBigEyeDecorator(Camera notice) {
        super(notice);
    }

    @Override
    void beauty() {
        super.beauty();
        bigEye();
    }

    public void bigEye(){
        System.out.println("大眼");
    }
}
