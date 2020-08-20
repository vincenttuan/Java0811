package com.pcschool.ocp.d09.case4;

public class ConfirmMain {
    public static void main(String[] args) {
        Confirm confirm1 = new Confirm() {
            @Override
            public boolean isPass(int n) {
                return n >= 60;
            }
        };
        
        Confirm confirm2 = new Confirm() {
            @Override
            public boolean isPass(int n) {
                return n >= 18 && n < 23;
            }
        };
        
        Confirm confirm3 = (n) -> n >= 60;
        Confirm confirm4 = (n) -> n >= 18 && n < 23;
        
        System.out.println(confirm3.isPass(80));
    }
}
