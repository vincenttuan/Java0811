package com.pcschool.ocp.d17_io.case4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class ReadWebImage {
    public static void main(String[] args) throws Exception {
        File file = new File("src\\main\\java\\com\\pcschool\\ocp\\d17_io\\car.jpg");
        String path = "https://www.playcar.org/uploads/others/63928_c229c860-e99f-42ab-9537-df1bd35e3255.jpg";
        URL url = new URL(path);
        try(InputStream is = url.openStream(); // 取得網路串流
            FileOutputStream fos = new FileOutputStream(file);) { 
            byte[] b = new byte[1];
            while (is.read(b) != -1) { // 將資料一個 byte 一個 byte 的讀進 byte[] b               
                fos.write(b); // 將 byte[] b 的資料一個 byte 一個 byte 的寫入到指定檔案 file 
            }
            System.out.println("寫入完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
