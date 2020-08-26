package com.pcschool.ocp.d16_derby.case1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;

public class UpdateRecord {
    public static void main(String[] args) throws Exception {
        String jdbcUrl = "jdbc:derby://localhost:1527/demo"; // 資料庫的位置在哪裡 ?
        String username = "app";
        String password = "app";
        // 建立資料庫連線
        Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
        // 建立預編敘述物件
        String sql = "UPDATE book SET price = ? WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        // 設定資料表欄位內容(1代表第1個問號的內容, 2代表第2個問號的內容, ...)
        pstmt.setInt(1, new Random().nextInt(1000));
        pstmt.setInt(2, 1);
        // 進行更新 (rowcount 會得到異動筆數)
        int rowcount = pstmt.executeUpdate();
        if(rowcount > 0) {
            System.out.printf("修改成功: %d\n", rowcount);
        } else {
            System.out.printf("修改失敗: %d\n", rowcount);
        }
        
    }
}
