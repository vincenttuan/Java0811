package com.pcschool.ocp.game.case3;

import java.io.File;
import java.util.Scanner;

public class PokerMain2 {
    public static void main(String[] args) throws Exception { // 拋出例外
        // 指定檔案位置
        File f = new File("src\\main\\java\\com\\pcschool\\ocp\\game\\case3\\poker.txt");
        // 透過 Scanner 抓取檔案內容
        Scanner sc = new Scanner(f);
        // 將檔案內容全部
        String allData = sc.useDelimiter("\\A").next();
        // 列印
        System.out.println(allData);
    }
}
