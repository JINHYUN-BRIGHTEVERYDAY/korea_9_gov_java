package com.korit.study.ch16_1;


import com.korit.study.ch16_1.repository.TodoList;
import com.korit.study.ch16_1.repository.UserList;
import com.korit.study.ch16_1.service.TodoService;
import com.korit.study.ch16_1.service.UserService;
import com.korit.study.ch16_1.view.TodoListView;

public class TodoListMain {
    public static void main(String[] args) {
        UserList userList = new UserList();

        UserService userService = new UserService(userList);

        TodoList todoList = new TodoList();

        TodoService todoService = new TodoService(todoList);

        TodoListView view = new TodoListView(userService, todoService);

        view.homeView();

        System.out.println("==<< 프로그램 종료 == >>");
    }
}
