package com.korit.study.ch16_1.service;

import com.korit.study.ch16_1.dto.TodoRegisterDto;
import com.korit.study.ch16_1.entity.Todo;
import com.korit.study.ch16_1.entity.User;
import com.korit.study.ch16_1.repository.TodoList;

public class TodoService {
    // 레퍼지토리에 접근하기 위한 멤버변수
    private TodoList todoList;

    // 생성자
    public TodoService(TodoList todoList) {
        this.todoList = todoList;
    }

    // Todo 등록하기 위한 메서드
    public void register(TodoRegisterDto todoRegisterDto) {
        Todo todo = todoRegisterDto.toTodo();

        // set으로 값을 설정하기
        todo.setId(todoList.generatedTodoId());
        todoList.add(todo);
    }


    // ??
    // 리스트 모두 출력하기
    public void printAllByUser(User user) {
        Todo[] foundTodos = todoList.findAllByUserId(user.getId());

        // 출력 로직을 추가하기
        if (foundTodos.length == 0) {
            System.out.println("등록된 할 일이 없습니다");
            return;
        }

        System.out.println("===" + user.getUsername() + "님의 할 일 목록 === ");
        for (Todo todo : foundTodos) {
            System.out.println(todo.toString());
        }
    }


}
