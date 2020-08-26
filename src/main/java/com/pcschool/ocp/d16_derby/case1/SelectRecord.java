package com.pcschool.ocp.d16_derby.case1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SelectRecord {
    public static void main(String[] args) throws Exception {
        String jdbcUrl = "jdbc:derby://localhost:1527/demo"; // 資料庫的位置在哪裡 ?
        String username = "app";
        String password = "app";
        // 建立資料庫連線
        Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
        // 建立 Statement 物件
        Statement stmt = conn.createStatement();
        // 執行查詢SQL
        String sql = "SELECT id, bname, price, ts FROM book";
        ResultSet rs = stmt.executeQuery(sql);
        // 將資料輪詢後印出
        while(rs.next()) {
            int id = rs.getInt("id");
            String bname = rs.getString("bname");
            int price = rs.getInt("price");
            Timestamp ts = rs.getTimestamp("ts");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
            System.out.printf("%4d %10s %4d %30s\n", id, bname, price, sdf.format(ts));
        }
        
        // 關閉連線
        conn.close();
    }
}
