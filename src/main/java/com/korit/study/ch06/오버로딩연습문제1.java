package com.korit.study.ch06;
/*
Copy// 정수 2개를 더하는 함수
public static int add(int a, int b) {
    return a + b;
}

// 실수 2개를 더하는 함수를 오버로딩으로 작성하세요
public static ______ add(______ a, ______ b) {
    // 여기에 코드 작성
}

// 정수 3개를 더하는 함수를 오버로딩으로 작성하세요
public static ______ add(______ a, ______ b, ______ c) {
    // 여기에 코드 작성
}

* */

public class 오버로딩연습문제1 {


    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(add(2.0, 3.0));
        System.out.println(add(2,3,4));
    }


    // 정수 2개를 더하는 함수
    public static int add(int a, int b) {
        return a + b;
    }

    // 실수 2개를 더하는 함수를 오버로딩으로 작성하세요
    public static double add(double a, double b) {
        return a + b;
    }

    // 정수 3개를 더하는 함수를 오버로딩으로 작성하세요
    public static int add(int a, int b, int c) {
        return a + b + c;
    }


}
