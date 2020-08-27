package com.pcschool.ocp.d17_io.case5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class BufferedCopy {
    public static void main(String[] args) {
        File source = new File("src\\main\\java\\com\\pcschool\\ocp\\d17_io\\report.txt");
        File target = new File("src\\main\\java\\com\\pcschool\\ocp\\d17_io\\report2.txt");
        try(FileInputStream fis = new FileInputStream(source);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            
            FileOutputStream fos = new FileOutputStream(target);
            OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);) {
            
            String data = null;
            while ( (data = br.readLine()) != null ) { // 逐行讀取
                System.out.println(data);
                bw.write(data);
                bw.newLine();
            }
            
        } catch (Exception e) {
        }
        
        
    }
}
