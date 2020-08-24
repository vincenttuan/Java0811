package com.pcschool.ocp.d12_exception.case5;

public class Client {
    public static void main(String[] args) {
        accessLogin();
    }
    
    public static void accessLogin() {
        LoginService service = new LoginService();
        String username = "john";
        String password = "12345";
        boolean check = service.login(username, password);
        System.out.println(check);
    }
}
