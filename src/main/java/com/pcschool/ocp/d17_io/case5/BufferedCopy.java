package com.pcschool.ocp.d17_io.case5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class BufferedCopy {
    public static void main(String[] args) {
        File source = new File("src\\main\\java\\com\\pcschool\\ocp\\d17_io\\report.txt");
        try(FileInputStream fis = new FileInputStream(source);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);) {
            
            String data = null;
            while ( (data = br.readLine()) != null ) { // 逐行讀取
                System.out.println(data);
            }
            
        } catch (Exception e) {
        }
        
        
    }
}
