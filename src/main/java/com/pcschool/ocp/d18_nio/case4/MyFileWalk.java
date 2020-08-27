package com.pcschool.ocp.d18_nio.case4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MyFileWalk {

    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src\\main\\java\\com\\pcschool\\ocp");
        Stream<Path> files = Files.walk(path);
        files.parallel()
                .filter(p -> p.toFile().isFile())
                .forEach(p -> System.out.println(p.getFileName()));
        
    }
}
