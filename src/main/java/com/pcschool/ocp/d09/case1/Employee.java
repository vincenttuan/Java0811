package com.pcschool.ocp.d09.case1;

// 外部類別
public class Employee {
    String name = "月例會";
    // 一般內部類別
    class Job {
        String name = "Java";
        public void program() {
            String name = "寫程式";
            System.out.println(name + ":" + this.name);
            
            Study study = new Study();
            study.read();
        }
        public void meeting() {
            String name = "開會";
            System.out.println(name + ":" + Employee.this.name);
        }
    }
    
    // 一般內部類別
    private class Study {
        public void read() {
            String appName = "美食 App"; // java 7 要加上 final, Java 8 不用(系統會自動判斷)
            int hours = 60;
            hours = 50;
            System.out.println("進修時間:" + hours + " H");
            // 方法內部類別
            class App {
                public void printName() {
                    System.out.println(appName); // 取用 final 變數
                }
            }
            App app = new App();
            app.printName();
        }
        
    }
    
}
