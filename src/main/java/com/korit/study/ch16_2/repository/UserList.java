package com.korit.study.ch16_2.repository;

import com.korit.study.ch16_2.entity.User;

// Repository 단계, 그러므로 Entity에 접근이 잦은 파트
public class UserList {


    // User 엔티티에 담아두었던 DB -> 배열로 만들기
    public User[] users;


    // UserList 생성하는 생성자

    public UserList() {
        this.users = new User[0];
    }



    // User배열 조회하는 메서드
    public User[] findAll() {
        if (users.length == 0) {
            return null;
        }
        return users;
    }



    // UserId 생성하기
    public int generateNewId() {
        int newId = 1;
        if (users.length == 0) {
            return newId;
        }
        return users[users.length -1].getId() + 1;
    }



    // User 추가하기
    public void add(User user) {
        User[] temp = new User[users.length + 1];
        for (int i = 0; i < users.length; i++) {
            temp[i] = users[i];
        }
        temp[users.length - 1] = user;
        temp = users;
    }


    // 특정 이름을 넣고 조회하기
   public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

}
