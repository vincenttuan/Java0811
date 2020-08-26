package com.pcschool.ocp.d16_derby.case4_book;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BookClient {

    private BookCRUD crud = new BookCRUD();

    public static void main(String[] args) {
        new BookClient().menu();
    }

    public void menu() {
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

    public void service(int choice) {
        switch (choice) {
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
    public void add() {
        // 取得使用者輸入
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入書名(bname): ");
        String bname = sc.next();
        System.out.print("請輸入價格(price): ");
        int price = sc.nextInt();
        // 建立 book 物件, 並將使用者所輸入的資料注入
        Book book = new Book();
        book.setBname(bname);
        book.setPrice(price);
        // 進行資料庫新增
        boolean check = crud.addBook(book);
        // 確認成功/失敗 ?
        System.out.println(check ? "新增成功" : "新增失敗");
    }

    // 修改紀錄
    public void update() {
        // 取得使用者輸入
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入要修改的 id:");
        int id = sc.nextInt();
        Book book = crud.getBook(id);
        if (book == null) {
            System.out.println("無此記錄");
            return;
        }
        System.out.print("是否要修改書名(y/n)?");
        if (sc.next().equals("y")) {
            System.out.print("請輸入書名(bname):");
            book.setBname(sc.next()); // 將使用者所輸入的資料注入到 book 的 bname 欄位中
        }
        System.out.print("是否要修改價格(y/n)?");
        if (sc.next().equals("y")) {
            System.out.print("請輸入價格(price):");
            book.setPrice(sc.nextInt()); // 將使用者所輸入的資料注入到 book 的 price 欄位中
        }
        boolean check = crud.updateBook(book);
        // 確認成功/失敗 ?
        System.out.println(check ? "修改成功" : "修改失敗");
    }

    // 刪除紀錄
    public void delete() {
        // 取得使用者輸入
        System.out.print("請輸入要刪除的 id: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        boolean check = crud.deleteBook(id);
        // 確認成功/失敗 ?
        System.out.println(check ? "刪除成功" : "刪除失敗");
    }

    // 查詢單筆
    public void get() {
        System.out.print("請輸入 id: ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        Book book = crud.getBook(id);
        display(Arrays.asList(book));
    }

    // 查詢多筆
    public void query() {
        display(crud.queryAll());
    }

    public void display(List<Book> books) {
        String leftAlignFormat = "| %-4d | %-15s | %-5d | %-25s |%n";
        System.out.format("+------+-----------------+-------+---------------------------+%n");
        System.out.format("| ID   | Book name       | Price | Timestamp                 |%n");
        System.out.format("+------+-----------------+-------+---------------------------+%n");
        for (Book book : books) {
            System.out.format(leftAlignFormat, book.getId(), book.getBname(), book.getPrice(), book.getTs());
        }
        System.out.format("+------+-----------------+-------+---------------------------+%n");
    }
}
