package com.korit.study.ch16_1.dto;

import com.korit.study.ch16_1.entity.Todo;
import com.korit.study.ch16_1.entity.User;

import java.time.LocalDateTime;

// 멤버변수 정의
public class TodoRegisterDto {
    private String contents;
    private User user;

    // 생성자
    public TodoRegisterDto(String contents, User user) {
        this.contents = contents;
        this.user = user;
    }

    // getter와 setter 정의하기
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    // toString 정의
    @Override
    public String toString() {
        return "TodoRegisterDto{" +
                "contents='" + contents + '\'' +
                ", user=" + user +
                '}';
    }

    public Todo toTodo() {
        return new Todo(0, contents, user, LocalDateTime.now());
    }


}
