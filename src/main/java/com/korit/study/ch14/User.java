package com.korit.study.ch14;

public class User {

    int id;
    String username;
    String password;
    String name;



    // AllArgsConstructor 적용, 생성자 생성
    User(int id, String username, String password, String name) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
    }


    // 클래스 안의 값을 확인하기 위함
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
