package com.korit.study.ch16_1.repository;

import com.korit.study.ch16_1.entity.User;



// Repository 단계, 그러므로 Entity에 접근이 잦은 파트
public class UserList {


    // User 엔티티에 담아두었던 DB -> 배열로 만들기
    public User[] users;



    // UserList 생성하는 생성자
    public UserList() {
        // this.users = users;
        this.users = new User[0];
    }



    // User배열 조회하는 메서드
    public User[] findAll() {
        return users;
    }



    // UserId 생성하기
    public int generatedUserId() {
        // 새로운 아이디를 1이라고 두고
        int newId = 1;
        // users 배열의 길이가 전혀 없으면 그냥 새로운 아이디를 반환하고
        if (users.length == 0) {
            return newId;
        }
        // 그렇지 않다면 -> ★
        return users[users.length - 1].getId() + 1;
        // getId는 User에서 private로 접근 불가능한 멤버변수를 위하여
        // getter로 만들었음
    }


    // User 추가하기 -> ★
    public void add(User user) {
        // 임시 사용자
        User[] temp = new User[users.length + 1];

        // 반복하여 User 추가하기
        for (int i = 0; i < users.length; i++) {
            temp[i] = users[i];
        }
        temp[temp.length - 1] = user;
        users = temp;
    }


    // 특정 이름을 넣고 조회하기
    public User findByUsername(String username) {

        // 향상된 for문으로 조회
        for (User user : users) {
            // user 엔티티에 있는 Username을 가져와서 (getter), 입력한 username과 일치하는지 보기
            if (user.getUsername().equals(username)) {
                // 그렇다면 DB 엔티티에 저장된 user를 반환
                return user;
            }
        }
        // 만약 조회되는 바가 없으면 null 반환처리
        return null;
    }



}
