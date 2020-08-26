package com.pcschool.ocp.d16_derby.case4_book;

import java.util.Scanner;

public class BookClient {
    private static BookCRUD crud = new BookCRUD();
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        System.out.println("1.新增紀錄");
        System.out.println("2.修改紀錄");
        System.out.println("3.刪除紀錄");
        System.out.println("4.查詢單筆");
        System.out.println("5.查詢全部");
        System.out.println("9.離開系統");
        System.out.println("-------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("請選擇:");
        int choice = sc.nextInt();
        if (choice == 9) {
            return;
        }
        service(choice);
        System.out.println("按下 enter 鍵繼續 ...");
        new Scanner(System.in).nextLine();
        menu();
    }
    
    public static void service(int choice) {
        switch(choice) {
            case 1:
                add();
                break;
            case 2:
                update();
                break;
            case 3:
                delete();
                break;
            case 4:
                get();
                break;
            case 5:
                query();
                break;    
        }
    }
    
    // 新增紀錄
    public static void add() {
        
    }
    
    // 修改紀錄
    public static void update() {
        
    }
    
    // 刪除錄
    public static void delete() {
        
    }
    
    // 查詢單筆
    public static void get() {
        
    }
    
    // 查詢多筆
    public static void query() {
        
    }
    
}
