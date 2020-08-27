package com.pcschool.ocp.d18_nio.case1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) {
        Path path = Paths.get("src\\main\\java\\com\\pcschool\\ocp\\d18_nio\\report.txt");
        //path.forEach(System.out::println);
        System.out.println("getFileName: " + path.getFileName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getRoot: " + path.getRoot());
        System.out.println("getNameCount: " + path.getNameCount());
        System.out.println("toAbsolutePath: " + path.toAbsolutePath());
    }
}
