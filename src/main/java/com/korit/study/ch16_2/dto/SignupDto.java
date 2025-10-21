package com.korit.study.ch16_2.dto;

public class SignupDto {
    // 멤버변수
    private String username;
    private String password;
    private String name;

    // 생성자
    public SignupDto(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    // getter와 setter 정의
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }


    public String getName() {
        return name;
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
}
