package com.pcschool.ocp.d17_io.case3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class WriteFile {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\pcschool\\ocp\\d17_io\\report.txt");
                                                                                    // true 保留原始檔案資料, false 清空原始檔案資料
        try(OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file, true), StandardCharsets.UTF_8)) {
            osw.write("\n洋蔥 x 2");
        } catch (Exception e) {
        }
    }
}
