package com.korit.study.ch22.repository;

import com.korit.study.ch22.entity.User;

import java.util.Arrays;
import java.util.Objects;


public class UserRepository {

    // 멤버변수
    // static 사용
    private static UserRepository instance;
//    private static UserRepository userRepository; -> 불필요

    // User 클래스에 있는 사용자들 배열로
    private User[] users;

    // 사용자 ID값
    private int autoIncrementedId;


    // 생성자 -> 멤버변수를 private로 지정하였으므로 생성자로 private
    private UserRepository() {

        // User 배열에 첫 번째 인덱스값 대입하기
        users = new User[0];
        autoIncrementedId = 1;
    }

    // 인스턴스 있는지 없는지 확인하여 대입하기
    // getter 사용하여 다른 클래스에 Instance 쓸 수 있도록
    public static UserRepository getInstance() {
        if (Objects.isNull(instance)) {
            instance = new UserRepository();
        } return instance;
    }

    public void insert(User user) {
        User[] temp = Arrays.copyOf(users, users.length + 1);
        user.setId(autoIncrementedId++);
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

    // 로그인을 시도한 사용자의 이름을 확인해야 한다
//    public User confirmLoginUser(String username) {
//        for (User user : users) {
//            if (user.getUsername().equals(username)) {
//                return user;
//            }
//        }
//        return null;
//    }

    // 로그인을 시도한 사용자의 비밀번호를 확인해야 한다
//    public User confirmLoginUserPassword(String password) {
//        for (User user : users) {
//            if (user.getPassword().equals(password)) {
//                return user;
//            }
//            return null;
//        }

//        private int generateId() {
//            return users[users.length].getId() + 1;
//        }

//     -> 전부 다 불필요했음


        // StringBuilder
        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("User 배열: [");
            for (int i = 0; i < users.length; i++) {
                stringBuilder.append(users[i]);
                if (i != users.length - 1) {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append("]");

            return stringBuilder.toString();
        }


}


//    public boolean validDuplicatedUsername(String username) {
//        return true;
//    }


