package com.pcschool.ocp.d16_derby.case4_book;

import java.sql.Timestamp;

public class Book {
    private int id;
    private String bname;
    private int price;
    private Timestamp ts;

    public Book() {
    }

    public Book(int id, String bname, int price, Timestamp ts) {
        this.id = id;
        this.bname = bname;
        this.price = price;
        this.ts = ts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Timestamp getTs() {
        return ts;
    }

    public void setTs(Timestamp ts) {
        this.ts = ts;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", bname=" + bname + ", price=" + price + ", ts=" + ts + '}';
    }
    
}
