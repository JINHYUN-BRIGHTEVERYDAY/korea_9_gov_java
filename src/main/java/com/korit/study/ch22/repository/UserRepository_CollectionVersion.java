package com.korit.study.ch22.repository;

import com.korit.study.ch22.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserRepository_CollectionVersion {

    private static UserRepository_CollectionVersion instance;

    private List<User> users;
    private int autoIncrementedId;

    private UserRepository_CollectionVersion() {
        users = new ArrayList<>();
        autoIncrementedId = 1;
    }

    public static UserRepository_CollectionVersion getInstance() {
        if (Objects.isNull(instance)) {
            instance = new UserRepository_CollectionVersion();
        }
        return instance;
    }

    public void insert(User user) {
        user.setId(autoIncrementedId++);
        users.add(user);
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("User 리스트: [");
        for (int i = 0; i < users.size(); i++) {
            stringBuilder.append(users.get(i));
            if (i != users.size() - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
