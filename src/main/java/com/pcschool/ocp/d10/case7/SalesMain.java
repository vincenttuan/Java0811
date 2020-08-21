package com.pcschool.ocp.d10.case7;

import com.google.gson.Gson;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SalesMain {
    public static void main(String[] args) throws Exception {
        String path = "src\\main\\java\\com\\pcschool\\ocp\\d10\\case7\\10000.json";
        File file = new File(path);
        String json = new Scanner(file).useDelimiter("\\A").next();
        // 透過 Gson 將 json 字串轉成陣列
        Sales[] saleses = new Gson().fromJson(json, Sales[].class);
        List<Sales> list = Arrays.asList(saleses);
        // stream 分析
        System.out.println(list);
        
    }
}
