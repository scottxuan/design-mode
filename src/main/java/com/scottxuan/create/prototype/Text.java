package com.scottxuan.create.prototype;

public class Text {
    public static void main(String[] args) {
        File file1 = new Excel();
        file1.display();
        File file2 = file1.clone();
        file2.display();
        System.out.println(file1==file2);

        File file3 = new Word();
        file3.display();
        File file4 = file3.clone();
        file4.display();
        System.out.println(file3==file4);
    }
}
