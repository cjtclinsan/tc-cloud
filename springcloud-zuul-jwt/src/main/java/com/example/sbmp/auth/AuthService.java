package com.example.sbmp.auth;


import com.example.sbmp.user.User;

public interface AuthService {
    User register(User userToAdd);
    String login(String username, String password);
    String refresh(String oldToken);
}
