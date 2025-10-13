package com.korit.study.ch17;

import java.util.Arrays;

public class User {
    private String username;
    private String password;
    private String[] roles;

    public User(String username, String password, String[] roles) {
        this.username = username;
        this.password = password;
        // this.password = password;  <- 제거 또는 주석 처리
        this.roles = roles; // <-- 🔥 이 부분이 추가되어야 합니다!
    }

    // ... 나머지 메서드는 그대로 ...


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String[] getRoles() {
        return roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + Arrays.toString(roles) +
                '}';
    }

}
