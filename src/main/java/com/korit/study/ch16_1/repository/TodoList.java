package com.korit.study.ch16_1.repository;

import com.korit.study.ch16_1.entity.Todo;

public class TodoList {

    // Todo 엔티티 객체 사용
    private Todo[] todos;

    // TodoList 생성자
    public TodoList() {
//        this.todos = todos;
        todos = new Todo[0];
    }

    // 새로운 아이디 생성
    public int generatedTodoId() {
        // 기본적으로 새로운 아이디 1으로 생성
        int newId = 1;

        // 만약 todos에 등록된 배열이 길이가 0으로서 전혀 없으면
        if (todos.length == 0) {
            return 1;
        }
    }
}
