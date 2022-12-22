package io_text_file.thuc_hanh;

import java.io.File;

public class TestFileClass {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("");
        System.out.println("Does it exist? " + file.exists());
    }
}
