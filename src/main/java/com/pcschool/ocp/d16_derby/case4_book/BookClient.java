package com.pcschool.ocp.d16_derby.case4_book;

public class BookClient {
    public static void main(String[] args) {
        System.gc();
        BookCRUD crud = new BookCRUD();
        crud.queryAll().forEach(System.out::println);
    }
}
