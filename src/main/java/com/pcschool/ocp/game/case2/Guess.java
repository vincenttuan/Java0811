package com.pcschool.ocp.game.case2;

public class Guess {
    public static void main(String[] args) {
        int[] ans  = {3, 8, 4, 5};
        int[] user = {0, 0, 0, 0};
        // 第一次猜
        String userAns = "1234";
        // 資料填入 user 陣列
        for(int i=0;i<user.length;i++) {
            user[i] = Integer.parseInt(userAns.charAt(i) + "");
        }
        // 列出 user 陣列資料
        for(int x : user) {
            System.out.print(x + " ");
        }
        System.out.println();
        // 幾 A 幾 B ?
        int a = 0;
        int b = 0;
        
    }
}
