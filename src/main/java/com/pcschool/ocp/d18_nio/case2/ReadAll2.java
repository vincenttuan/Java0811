package com.pcschool.ocp.d18_nio.case2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAll2 {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src\\main\\java\\com\\pcschool\\ocp\\d18_nio\\report.txt");
        Files.readAllLines(path)
                .stream()
                .parallel()
                .forEach(System.out::println);
        
        
    }
}
