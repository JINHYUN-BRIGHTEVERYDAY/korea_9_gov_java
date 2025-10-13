package com.korit.study.ch16.service;

import com.korit.study.ch14.User;
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

    void printAllByUser(User user) {
        com.korit.study.ch14.Todo[] foundTodos = todoList.findAllByUserId(user.getId());
        for (com.korit.study.ch14.Todo todo : foundTodos) {
            System.out.println(todo.toString());
        }
    }
}
