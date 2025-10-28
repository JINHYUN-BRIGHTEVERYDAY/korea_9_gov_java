package com.korit.study.ch30.mapPractice2;

/*
* 5. 이메일 도메인을 추출하기
* 각 이메일에서 도메인 부분만 추출하기
* (@ 이후 부분만을 출력하기)
*
* */

import java.util.Arrays;
import java.util.List;

public class Solution5 {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
                "user1@gmail.com",
                "admin@company.co.kr",
                "support@naver.com",
                "info@daum.net"
        );

        emails.stream()
                .map(s -> {
                    int index = s.indexOf("@");
                    if (index != -1) {
                        return s.substring(index + 1);
                    } else {
                        return s;
                    }
                })
                .forEach(System.out::println);


    }
}
