package com.pcschool.ocp.d16_derby.case1;

import java.sql.Connection;
import java.sql.DriverManager;

public class InsertRecord {
    public static void main(String[] args) throws Exception {
        String jdbcUrl = "jdbc:derby://localhost:1527/demo"; // 資料庫的位置在哪裡 ?
        String username = "app";
        String password = "app";
        // 建立資料庫連線
        Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
        
    }
}
