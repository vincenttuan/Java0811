package com.pcschool.ocp.d16_derby.case3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class MyClose implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("MyClose 資源關閉了");
    }

}

public class UpdateRecord {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:derby://localhost:1527/demo"; // 資料庫的位置在哪裡 ?
        String username = "app";
        String password = "app";
        String sql = "SELECT * FROM book WHERE id = 1";
        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql);
             MyClose mc = new MyClose();   ) {

            if (rs.last()) { // 是否有資料 ? 將游標指向該筆紀錄
                rs.updateInt("price", 600);
                //rs.cancelRowUpdates();
                rs.updateRow();
                System.out.println("Update OK");
            } else {
                System.out.println("Update Error (查無資料)");
            }

        } catch (Exception e) {
        }

    }
}
