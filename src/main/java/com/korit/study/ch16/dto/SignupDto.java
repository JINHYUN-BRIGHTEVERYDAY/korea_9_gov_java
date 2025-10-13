package com.korit.study.ch16.dto;

import com.korit.study.ch16.entity.User;

public class SignupDto {
    private String username;
    private String password;
    private String name;

    public SignupDto(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }


    // Username에 대한 getter
    public String getUsername() {
        return username;
    }

//    // Username에 대한 setter
//    public void setUsername(String username) {
//        this.username = username;
//    }

    // Password에 대한 getter
    public String getPassword() {
        return password;
    }

//    // Password에 대한 setter
//    public void setPassword(String password) {
//        this.password = password;
//    }

    // name에 대한 getter
    public String getName() {
        return name;
    }

//    // name에 대한 setter
//    public void setName(String name) {
//        this.name = name;
//    }



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
