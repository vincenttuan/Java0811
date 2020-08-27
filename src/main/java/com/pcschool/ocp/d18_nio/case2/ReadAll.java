package com.pcschool.ocp.d18_nio.case2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAll {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src\\main\\java\\com\\pcschool\\ocp\\d18_nio\\report.txt");
        List<String> list = Files.readAllLines(path);
        System.out.println(list); // 單工模式
        
        
    }
}
