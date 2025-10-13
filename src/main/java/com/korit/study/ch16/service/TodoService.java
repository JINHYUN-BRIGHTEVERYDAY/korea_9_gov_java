package com.korit.study.ch16.service;

import com.korit.study.ch16.entity.User;
import com.korit.study.ch16.repository.TodoList;
import com.korit.study.ch16.dto.TodoRegisterDto;
import com.korit.study.ch16.entity.Todo;

public class TodoService {
    private TodoList todoList;

    public TodoService(TodoList todoList) {

        this.todoList = todoList;
    }

    public void register(TodoRegisterDto todoRegisterDto) {
        Todo todo = todoRegisterDto.toTodo();
        todo.setId(todoList.generatedTodoId());
//        todo.id = todoList.generatedTodoId();
        todoList.add(todo);
    }

    public void printAllByUser(User user) {
        Todo[] foundTodos = todoList.findAllByUserId(user.getId());
        // 출력 로직 추가
        if (foundTodos.length == 0) {
            System.out.println("등록된 할 일이 없습니다.");
            return;
        }

        System.out.println("=== " + user.getUsername() + "님의 할 일 목록 ===");
        for (Todo todo : foundTodos) {
            System.out.println(todo.toString());
        }
    }
}
