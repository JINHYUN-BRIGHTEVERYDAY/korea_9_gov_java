package com.korit.study.ch14;

import java.util.Scanner;

public class UserService {

    //UserList에 대한 객체 생성
    //UserService의 성분 표시
    UserList userList = new UserList();

    Scanner scanner = new Scanner(System.in);

    // UserService에 대한 생성자 만들기
    public UserService(UserList userList) {
        this.userList = userList;
    }

    boolean isduplicatedUsername(String username) {
        // userList에 username이 이미 있으므로 중복되었다
        return userList.findByUsername(username) != null;
    }

    // 로그인
    User signin(SigninDto signinDto) {
        User foundUser = userList.findByUsername(signinDto.username);
        if (foundUser == null) {
            // 사용자이름
            return null;
        }
        if (!foundUser.password.equals(signinDto.password)) {
            return null;
        }
        return foundUser;
    }


    // 회원가입
    void signup(SignupDto signupDto) {
        User user = signupDto.toUser();
        user.id = userList.generateUserId();
        userList.add(user);
    }

    void printUserListAll() {
        System.out.println("등록된 사용자 전체 조회하기");
        for (User user : userList.users) {
            System.out.println(user.toString());
        }
    }
}
