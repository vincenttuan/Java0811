package com.pcschool.ocp.d17_io.case3;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadFile2 {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\pcschool\\ocp\\d17_io\\report.txt");
        try(InputStreamReader fis = new InputStreamReader(new FileInputStream(file), "UTF-8");) { // 將 ANSI 轉 UTF-8
            StringBuilder sb = new StringBuilder();
            char[] cbuf = new char[1];
            while (fis.read(cbuf) != -1) {                
                String s = new String(cbuf); //char[] 轉 String
                sb.append(s); // 將 s 累積到 sb
            }
            System.out.println(sb);
        } catch (Exception e) {
        }
        
    }
}
