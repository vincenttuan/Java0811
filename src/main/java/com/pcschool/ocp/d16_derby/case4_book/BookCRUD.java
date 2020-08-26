package com.pcschool.ocp.d16_derby.case4_book;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
    private Object pstmt;
    
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
    
    // 查詢單筆
    public Book getBook(int id) {
        Book book = null;
        String sql = "SELECT id, bname, price, ts FROM book WHERE id = ?";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                book = new Book(rs.getInt("id"), 
                                     rs.getString("bname"), 
                                     rs.getInt("price"), 
                                     rs.getTimestamp("ts"));
            }
        } catch (Exception e) {
        }
        return book;
        
    }
    
    // 新增單筆
    public boolean addBook(Book book) {
        String sql = "INSERT INTO book(bname, price) VALUES(?, ?)";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, book.getBname());
            pstmt.setInt(2, book.getPrice());
            int rowcount = pstmt.executeUpdate();
            return rowcount > 0 ? true : false;
        } catch (Exception e) {
        }
        return false;
    }
    
    // 修改單筆
    public boolean updateBook(Book book) {
        String sql = "UPDATE book SET bname=?, price=? WHERE id=?";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, book.getBname());
            pstmt.setInt(2, book.getPrice());
            pstmt.setInt(3, book.getId());
            int rowcount = pstmt.executeUpdate();
            return rowcount > 0 ? true : false;
        } catch (Exception e) {
        }
        return false;
    }
    
    // 刪除單筆
    public boolean deleteBook(int id) {
        String sql = "DELETE FROM book WHERE id=?";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, id);
            int rowcount = pstmt.executeUpdate();
            return rowcount > 0 ? true : false;
        } catch (Exception e) {
        }
        return false;
    }
    
}
