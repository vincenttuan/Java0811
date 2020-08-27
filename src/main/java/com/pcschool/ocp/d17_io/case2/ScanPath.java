package com.pcschool.ocp.d17_io.case2;

import java.io.File;

public class ScanPath {
    public static void main(String[] args) {
        File path = new File("src\\main\\java\\com\\pcschool\\ocp\\d17_io");
        for(String fname : path.list()) {
            File f = new File(path.getPath() + "/" + fname); // 組合新的路徑
            System.out.printf("%s 的完整路徑是: %s 它是: %s\n", fname, f.getPath(), f.isDirectory()?"目錄":"檔案");
        }
    }
}
