package com.korit.study.ch06;

/*
이름만 출력하는 함수
public static void printInfo(String name) {
    System.out.println("이름: " + name);
}

// 이름과 나이를 출력하는 함수를 오버로딩으로 작성하세요
// 이름, 나이, 학교를 출력하는 함수도 오버로딩으로 작성하세요

* */

public class 오버로딩연습문제2 {
    public static void main(String[] args) {
        printInfo("JINHYUN");
        printInfo("JINHYUN", 30);
        printInfo("JINHYUN", 30, "코리아IT");

    }

    // 이름만 출력하는 함수
    public static void printInfo(String name) {
        System.out.println("이름: " + name);
    }

    // 이름과 나이를 출력하는 함수
    public static void printInfo(String name, int age) {
        System.out.println("이름: " + name + "," + "나이: " + age);
    }

    // 이름과 나이, 학교를 출력하는 함수
    public static void printInfo(String name, int age, String school) {
        System.out.println("이름: " + name + "," + "나이: " + age + "," + "학교: " + school );
    }
}
