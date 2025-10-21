package com.korit.study.ch16_2.entity;

import java.time.LocalDateTime;

public class Todo {
    // 멤버변수
    private int id;
    private String contents;
    private User user;
    private LocalDateTime localDateTime;


    // 생성자
    public Todo(int id, String contents, User user, LocalDateTime localDateTime) {
        this.id = id;
        this.contents = contents;
        this.user = user;
        this.localDateTime = localDateTime;
    }

    // getter
    public int getId() {
        return id;
    }

    public String getContents() {
        return contents;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }


    // setter
    public void setId(int id) {
        this.id = id;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    // toString
    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", contents='" + contents + '\'' +
                ", user=" + user +
                ", localDateTime=" + localDateTime +
                '}';
    }

}
