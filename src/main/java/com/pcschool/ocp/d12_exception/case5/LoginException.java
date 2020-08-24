package com.pcschool.ocp.d12_exception.case5;

public class LoginException extends Exception {

    public LoginException(String string) {
        super(string);
    }
    
    public void how2do() {
        System.out.println("請重新登入!");
    }
}
