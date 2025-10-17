package com.korit.study.ch22.entity;

public class User {
    // 멤버변수
    private int id;
    private String username;
    private String password;

    // 생성자
    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    // getter
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    // Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // toString
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
