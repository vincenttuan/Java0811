package com.pcschool.ocp.d16_derby.case4_book;

import java.sql.Connection;
import java.sql.DriverManager;

public class BookDao {
    private static final BookDao dao = new BookDao();
    private Connection conn;
    private BookDao() {
        String jdbcUrl = "jdbc:derby://localhost:1527/demo"; // 資料庫的位置在哪裡 ?
        String username = "app";
        String password = "app";
        try {
            conn = DriverManager.getConnection(jdbcUrl, username, password);
        } catch (Exception e) {
        }
    }
    
    public static BookDao getInstance() {
        return dao;
    }

    @Override
    protected void finalize() throws Throwable {
        if(conn != null) {
            try {
                conn.close();
            } catch (Exception e) {
            }
        }
    }
    
    
}
