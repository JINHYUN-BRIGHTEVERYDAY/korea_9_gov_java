package com.korit.study.ch16.dto;


// SigninDto 객체
public class SigninDto {
    private String username;
//    private String password;
    private String password;


    // SigninDto 생성자
    public SigninDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //getter와 setter 생성
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


    @Override
    public String toString() {
        return "SigninDto{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}


