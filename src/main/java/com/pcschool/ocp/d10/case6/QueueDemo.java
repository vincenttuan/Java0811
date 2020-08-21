package com.pcschool.ocp.d10.case6;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) throws Exception {
        // 排隊
        Queue<String> queue = new LinkedList<>();
        queue.add("John");
        queue.add("Mary");
        queue.add("Helen");
        System.out.printf("目前排隊: %s\n", queue);Thread.sleep(3000);
        // 進場
        System.out.println("開始進場");Thread.sleep(3000);
        while (!queue.isEmpty()) {
            String name = queue.poll();
            System.out.printf("%s 進場, 目前排隊: %s\n", name, queue);Thread.sleep(3000);
        }
        System.out.printf("目前排隊: %s\n", queue);
    }
}
