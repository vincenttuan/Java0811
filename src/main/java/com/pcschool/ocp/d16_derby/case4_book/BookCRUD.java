package com.pcschool.ocp.d16_derby.case4_book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
    進行 Book 的新增, 修改, 刪除, 查詢之行為
*/
public class BookCRUD {
    private BookDao dao = BookDao.getInstance();
    private Connection conn = dao.getConn();
    
    // 查詢所有 book 資料
    public List<Book> queryAll() {
        List<Book> books = new ArrayList<>();
        String sql = "SELECT id, bname, price, ts FROM book";
        try(Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while(rs.next()) {
                Book book = new Book(rs.getInt("id"), 
                                     rs.getString("bname"), 
                                     rs.getInt("price"), 
                                     rs.getTimestamp("ts"));
                books.add(book);
            }
        } catch (Exception e) {
        }
        return books;
    }
    
}
