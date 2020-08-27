package com.pcschool.ocp.d18_nio.case3;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopyAndDelete {
    public static void main(String[] args) throws Exception {
        Path source = Paths.get("src\\main\\java\\com\\pcschool\\ocp\\d18_nio\\a.txt");
        Path target = Paths.get("src\\main\\java\\com\\pcschool\\ocp\\d18_nio\\b.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        Files.delete(source);
        System.out.println("完成!");
    }
}
