package com.pcschool.ocp.d17_io.case2;

import java.io.File;

public class RecScanPath {
    static int java_file_count = 0;
    public static void main(String[] args) {
        String s = "src\\main\\java\\com\\pcschool\\ocp";
        File path = new File(s);
        scan(path);
        System.out.printf("java_file_count: %d 支\n", java_file_count);
    }

    public static void scan(File path) {
        try {
            for (String fname : path.list()) {
                File f = new File(path.getPath() + File.separator + fname);
                System.out.printf("%s 是%s\n", f.getPath(), f.isFile() ? "檔案" : "目錄");
                if (f.isDirectory()) {
                    scan(f);
                } else {
                    if(f.getName().contains(".java")) {
                        ++java_file_count;
//                        if(java_file_count == 150) {
//                            System.out.println("第150支是:" + f);
//                        }
                    }
                }
            }
        } catch (Exception e) {
        }

    }

}
