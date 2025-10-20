package com.korit.study.ch16_1.entity;

import java.time.LocalDateTime;

// 멤버변수
public class Todo {
    private int id;
    private String contents;
    private User user;
    private LocalDateTime createAt;

    // 생성자
    public Todo(int id, String contents, User user, LocalDateTime createAt) {
        this.id = id;
        this.contents = contents;
        this.user = user;
        this.createAt = createAt;
    }


    // getter, setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }


    // toString
    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", contents='" + contents + '\'' +
                ", user=" + user +
                ", createAt=" + createAt +
                '}';
    }
}
