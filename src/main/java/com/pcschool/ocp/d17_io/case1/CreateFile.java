package com.pcschool.ocp.d17_io.case1;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        String path = "src\\main\\java\\com\\pcschool\\ocp\\d17_io\\case1\\hello.txt";
        File file = new File(path);
        System.out.printf("檔案是否存在? %b\n", file.exists());
        if(!file.exists()) {
            try {
                System.out.printf("建立檔案是否成功? %b\n", file.createNewFile());
            } catch (IOException e) {
                System.out.printf("失敗: %s\n", e.toString());
            }
            System.out.printf("再次檢查檔案是否存在? %b\n", file.exists());
        }
    }
}
