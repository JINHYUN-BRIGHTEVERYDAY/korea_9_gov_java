package com.korit.study.ch14;

public class TodoService {
    TodoList todoList;

    TodoService(TodoList todoList) {
        this.todoList = todoList;
    }

    void register(TodoRegisterDto todoRegisterDto) {
        Todo todo = todoRegisterDto.toTodo();
        todo.id = todoList.generatedTodoId();
        todoList.add(todo);
    }

    void printAllByUserId(User user) {
        Todo[] todos = todoList.findAllByUserId(user.id);

        System.out.println("사용자 ID: " + user.id + ", 이름: " + user.name + "의 할 일 목록");
        if (todos.length == 0) {
            System.out.println("할 일이 없습니다.");
            return;
        }

        for (Todo todo : todos) {
            System.out.println(todo.toString());
        }
    }
}
