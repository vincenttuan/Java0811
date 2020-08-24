package com.pcschool.ocp.d12_exception.case2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFileDemo {
    public static void main(String[] args) {
        // 檔案路徑 path
        String path = "src\\main\\java\\com\\pcschool\\ocp\\d12_exception\\case2\\news.txt";
        // 取得檔案 File
        File file = new File(path);
        try {
            // 讀取檔案內容
            String data = new Scanner(file).useDelimiter("\\A").next();
            // 列印內容
            System.out.println(data);
        } catch (FileNotFoundException ex) {
            System.out.printf("檔案路徑錯誤: %s\n", ex);
        }
    }
}
