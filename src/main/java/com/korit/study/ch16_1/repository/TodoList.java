package com.korit.study.ch16_1.repository;


import com.korit.study.ch16_1.entity.Todo;

public class TodoList {
    private Todo[] todos;

    // ??
    public TodoList() {
        todos = new Todo[0];
    }

    public int generatedTodoId() {
        int newId = 1;
        if (todos.length == 0) {
            return 1;
        }
        // ?
        // newId = todos[todos.length -1].id;
        return todos.length == 0 ? 1 : todos[todos.length -1].getId() + 1;
        // id를 꺼내오는 과정
    }

    public Todo[] getTodos() {
        return todos;
    }


    // ?
    // Todo를 리스트에 추가하기
    public void add(Todo todo) {
        Todo[] temp = new Todo[todos.length + 1];
        for (int i = 0; i < todos.length; i++) {
            temp[i] = todos[i];
        }
        temp[temp.length -1] = todo;
        todos = temp;
    }

    // ?
    // 다건 조회하기
    public Todo[] findAllByUserId(int userId) {
        int foundTodoCounter = 0;
        for (Todo todo : todos) {
            if (todo.getUser().getId() == userId) {
                foundTodoCounter++;
            }
        }
        Todo[] foundTodos = new Todo[foundTodoCounter];
        for (int i = 0, j = 0; i < todos.length; i++) {
            if (todos[i].getUser().getId() == userId) {
                foundTodos[j] = todos[i];
                j++;
                }
            }
        return foundTodos;
    }
}
