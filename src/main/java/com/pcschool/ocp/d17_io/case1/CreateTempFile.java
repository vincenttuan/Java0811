package com.pcschool.ocp.d17_io.case1;

import java.io.File;
import java.io.IOException;

public class CreateTempFile {
    public static void main(String[] args) throws IOException {
        File path = new File("src\\main\\java\\com\\pcschool\\ocp\\d17_io\\case1");
        File file = File.createTempFile("temp", ".txt", path);
        System.out.println(file.getPath());
        System.out.println(file.getName());
    }
}
