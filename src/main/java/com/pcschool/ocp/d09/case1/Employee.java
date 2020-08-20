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
            String appName = "美食 App";
            int hours = 60;
            hours = 50;
            System.out.println("進修時間:" + hours + " H");
            // 方法內部類別
            class App {
                public void printName() {
                    System.out.println(appName);
                }
            }
            App app = new App();
            app.printName();
        }
        
    }
    
}
