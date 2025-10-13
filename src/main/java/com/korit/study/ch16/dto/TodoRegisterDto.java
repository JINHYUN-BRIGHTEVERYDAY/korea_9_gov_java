package com.korit.study.ch16.dto;

import com.korit.study.ch16.entity.Todo;
import com.korit.study.ch16.entity.User;

import java.time.LocalDateTime;

public class TodoRegisterDto {
    private String contents;
    private User user;

    public TodoRegisterDto(String contents, User user) {
        this.contents = contents;
        this.user = user;
    }


    // contents에 대한 getter
    public String getContents() {
        return contents;
    }

    // contents에 대한 setter
    public void setContents(String contents) {
        this.contents = contents;
    }


    // user에 대한 getter
    public User getUser() {
        return user;
    }

    // user에 대한 setter
    public void setUser (User user) {
        this.user = user;
    }


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
