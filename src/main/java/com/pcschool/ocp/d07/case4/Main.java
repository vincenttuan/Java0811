package com.pcschool.ocp.d07.case4;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // 取得 json 字串
        String path = "src\\main\\java\\com\\pcschool\\ocp\\d07\\case4\\programmer.json";
        String json = new Scanner(new File(path)).useDelimiter("\\A").next();
    }
}
