package com.pcschool.ocp.d18_nio.case2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class FindBug {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src\\main\\java\\com\\pcschool\\ocp\\d18_nio\\report.txt");
        Optional<String> data = Files.readAllLines(path)
                .stream()
                .peek(System.out::println)
                .filter(s -> s.contains("bug"))
                .parallel() // 多工
                .findFirst();
                
        if(data.isPresent()) {
            System.out.println("找到了:" + data.get());
        } else {
            System.out.println("沒有找到");
        }
        
    }
}
