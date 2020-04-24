package com.scottxuan.structure.decorator;

/**
 * @author : zhaoxuan
 */
public abstract class CameraDecorator extends Camera {
    private Camera notice;

    public CameraDecorator(Camera notice) {
        this.notice = notice;
    }

    @Override
    void beauty() {
        notice.beauty();
    }
}
