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
//        a = 1.1;
//        b = 2.2;
        return a + b;
        // return (int)(a + b); -> int로 변환하여 반환 : 3으로
        // -> 이 상태에서 호출하면 double로 호출되기 때문에: 3.0으로 반환될 것
    }

    // 정수 3개를 더하는 함수를 오버로딩으로 작성하세요
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

}
