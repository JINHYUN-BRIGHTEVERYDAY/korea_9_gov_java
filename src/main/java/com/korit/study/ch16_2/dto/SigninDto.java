package com.korit.study.ch16_2.dto;

public class SigninDto {
    // 멤버변수
    private String username;
    private String password;


    // 생성자
    public SigninDto(String username, String password) {
        this.username = username;
        this.password = password;
    }


    // getter, setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // toString
    @Override
    public String toString() {
        return "SigninDto{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
