package com.korit.study.ch30.mapPractice;

/*

문제 6: 문자열 포맷팅

List<String> usernames = Arrays.asList("john", "mary", "steve");


각 사용자명을 "User: {username}" 형식으로 변환하세요.


예상 출력: [User: john, User: mary, User: steve]


*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



class User {
    private String name;


    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }

    public User() {
        this.name = name;
    }

}


public class Practice6 {


    public static void main(String[] args) {
        User user = new User();

        List<String> usernames = Arrays.asList("john", "mary", "steve");

        List<String> formattedStrings = usernames.stream()
                .map(username -> String.format("Users : %s", username))
                .collect(Collectors.toList());

        formattedStrings.forEach(System.out::println);

    }

}
