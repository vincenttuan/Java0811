package com.pcschool.ocp.d07.case4;

import com.google.gson.Gson;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // 取得 json 字串
        String path = "src\\main\\java\\com\\pcschool\\ocp\\d07\\case4\\programmer.json";
        String json = new Scanner(new File(path)).useDelimiter("\\A").next();
        //System.out.println(json);
        // 透過 Gson 將 json 資料匯入到 Programmer[] 陣列中
        Programmer[] programmers = new Gson().fromJson(json, Programmer[].class);
        // 有幾筆資料 ?
        System.out.printf("資料筆數: %d\n", programmers.length);
        // 請問所有 Programmer 總薪資 ? 平均薪資 ? 最高 ? 最低 ?
        
    }
}
