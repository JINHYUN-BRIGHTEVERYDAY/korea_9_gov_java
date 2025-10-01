package com.korit.study.ch14;

public class TodoListMain {
    public static void main(String[] args) {

        // 의존성 주입되도록
        UserList userList = new UserList();
        UserService userService = new UserService(userList);

        // 회원가입하고 로그인하기
        TodoListView todoListView = new TodoListView(userService);


        todoListView.homeView();

        System.out.println("== << 프로그램 종료");

    }
}
