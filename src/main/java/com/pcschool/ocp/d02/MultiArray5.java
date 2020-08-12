package com.pcschool.ocp.d02;

public class MultiArray5 {

    public static void main(String[] args) {
        char[][] ttt = {
            {'O', 'O', 'X'},
            {'X', 'O', ' '},
            {'X', ' ', 'X'}
        };
        int x = 5;
        ttt[x/3][x%3] = 'X';
        System.out.println("X 勝利");
        // 印出最後結局
        for(int i=0;i<ttt.length;i++) {
            System.out.println(ttt[i]);
        }
    }
}
