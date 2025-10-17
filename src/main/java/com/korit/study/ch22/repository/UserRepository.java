package com.korit.study.ch22.repository;

import com.korit.study.ch22.entity.User;

import java.util.Arrays;
import java.util.Objects;

public class UserRepository {

    private static UserRepository instance;
    private User[] users;


    // 생성자
    private UserRepository() {
        users = new User[0];
    }

    // 인스턴스 있는지 없는지 확인하여 대입하기
    public static UserRepository getInstance() {
        if (Objects.isNull(instance)) {
            instance = new UserRepository();
        } return instance;
    }

    public void insert(User user) {
        User[] temp = Arrays.copyOf(users, users.length + 1);
        temp[temp.length - 1] = user;
        users = temp;
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    private int generateId() {
        return users[users.length].getId() + 1;
    }
}


//    public boolean validDuplicatedUsername(String username) {
//        return true;
//    }


