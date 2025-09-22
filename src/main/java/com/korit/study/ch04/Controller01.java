package com.korit.study.ch04;

public class Controller01 {
    public static void main(String[] args) {
//        조건
//        String text = num > 5 ? "5보다 큽니다" : "5보다 작습니다";
//        System.out.println(text);

        int num = 10;

        if (num >= 5) {
            System.out.println("5보다 큽니다"); // 조건이 만족하면 명령을 실행할 수 있다
        } else {
            System.out.println("5이하 입니다.");
        }

        int score = 85;


        // 하나의 명령만을 실행 -> 중괄호 사용필요하지 않음
        if (score > 50) System.out.println("50보다 큽니다.");
        else System.out.println("50이하 입니다.");


        // 두 개 이상의 명령을 실행 -> 중괄호 사용
        if (score >= 95) {
            System.out.println("A+");
        } else if (score >= 90) {
            System.out.println("A");
        } else if (score >= 85) {
            System.out.println("B+");
        } else {
            System.out.println("B");
        }
    }
}
