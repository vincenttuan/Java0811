package com.pcschool.ocp.d04;

public class Book {
    private int pages = 200; // 預設最多頁數

    public Book() {
        
    }
    
    public Book(int pages) {
        if(pages > 0 && pages < this.pages){
            this.pages = pages;
        }
    }

    @Override
    public String toString() {
        return "Book{" + "pages=" + pages + '}';
    }
    
    
    
}
