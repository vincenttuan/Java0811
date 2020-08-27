package com.pcschool.ocp.d17_io.case2;

import java.io.File;

public class RecScanPath {

    public static void main(String[] args) {
        String s = "C:\\";
        File path = new File(s);
        scan(path);
    }

    public static void scan(File path) {
        try {
            for (String fname : path.list()) {
                File f = new File(path.getPath() + File.separator + fname);
                System.out.printf("%s 是%s\n", f.getPath(), f.isFile() ? "檔案" : "目錄");
                if (f.isDirectory()) {
                    scan(f);
                }
            }
        } catch (Exception e) {
        }

    }

}
