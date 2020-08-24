package com.pcschool.ocp.d12_exception.case5;

import java.util.Optional;

public class LoginrService {
    public boolean login(String username, String password) {
        // 判斷是否有此帳號 ?
        Optional<User> optUser = UserDB.getInstance().getUser(username);
        if(optUser.isPresent()) { // 此帳號存在
            // 取得 User 物件
            User user = optUser.get();
            // 判斷密碼是否正確 ?
            if(user.getPassword().equals(password)) {
                return true;
            } else {
                return false; // 密碼錯誤
            }
        } else {
            return false; // 帳號錯誤(帳號不存在)
        }
    }
}
