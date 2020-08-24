package com.pcschool.ocp.d12_exception.case5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserDB {
    private List<User> users;
    private static final UserDB USER_INSTANCE = new UserDB();
    
    private UserDB() {
        users = Arrays.asList(new User("john", "1234"), new User("mary", "5678"));
    }
    
    public static UserDB getInstance() {
        return USER_INSTANCE;
    }
    
    public List<User> getUsers() {
        return users;
    }
    
    public Optional<User> getUser(String username) {
        return users.stream().filter(u -> u.getUsername().equals(username)).findFirst();
    }
    
}
