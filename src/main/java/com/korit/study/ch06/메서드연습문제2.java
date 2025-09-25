package com.korit.study.ch06;

/*
Copy// 매개변수 있음, 리턴값 없음
// 이름을 받아서 "안녕하세요, [이름]님!"을 출력하는 함수를 작성하세요
public static void ______(String name) {
    // 여기에 코드 작성
}

* */

public class 메서드연습문제2 {
    public static void main(String[] args) {
        printName("이름");
        // 이름을 받아서 "안녕하세요, [이름]님!" 출력하는 함수 호출
    }

    public static void printName(String name) {
        System.out.println("안녕하세요, [" + name + "] 님!");
        // 매개변수 있음, 그러나 반환값이 없음
    }
}
