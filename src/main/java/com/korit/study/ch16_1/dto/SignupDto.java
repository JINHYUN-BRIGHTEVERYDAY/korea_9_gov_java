package com.korit.study.ch16_1.dto;

import com.korit.study.ch16_1.entity.User;

public class SignupDto {
    private String username;
    private String password;
    private String name;

    // 생성자
    public SignupDto(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    // getter 정의 -> 멤버변수가 private 이기 때문에
    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }


    // setter 정의
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void setName(String name) {
        this.name = name;
    }


    // toString
    @Override
    public String toString() {
        return "SignupDto{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public User toUser() {
        return new User(0, username, password, name);
    }

}
