package com.scottxuan.structure.decorator;

/**
 * @author : zhaoxuan
 * @date : 2020/4/24
 */
public class Test {
    public static void main(String[] args) {
        Camera camera,camera1,camera2;
        camera = new CameraWhite();
        camera1 = new CameraThinFaceDecorator(camera);
        camera2 = new CameraBigEyeDecorator(camera1);
        camera2.beauty();
    }
}
