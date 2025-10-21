package com.korit.study.ch16_2.repository;

import com.korit.study.ch16_2.entity.Todo;

public class TodoList {

    private Todo[] todos;


    public TodoList() {
        this.todos = new Todo[0];
    }

    public int generateNewId() {
        int newId = 1;
        if (todos.length == 0) {
            return newId;
        }
        return todos[todos.length - 1].getId() + 1;

        // todos.length == 0 ? 1 : todos[todos.length - 1].getId() + 1;
    }

    public Todo[] getTodos() {
        if (todos.length == 0) {
            return null;
        }
        return todos;
    }

    public void add(Todo todo) {
        Todo[] temp = new Todo[todos.length + 1];

        for (int i = 0; i < todos.length; i++) {
            temp[i] = todos[i];
        }
        temp[todos.length - 1] = todo;
        temp = todos;
    }

    public Todo[] foundAllByUserId(int userId) {
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
