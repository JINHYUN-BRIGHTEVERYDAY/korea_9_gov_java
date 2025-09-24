package com.korit.study.ch05;

public class solution2 {
    public static void main(String[] args) {
        /* 문제 2: 배열 요소들의 합계 구하기
        * 정수형 배열 {5, 10, 15, 20, 25}의
        * 모든 요소의 합을 구하여 출력하는 프로그램 작성하기
        * */



        System.out.println("===== 첫 번째 풀이 =====");

        int b[] = new int [5];
        b[0] = 5;
        b[1] = 10;
        b[2] = 15;
        b[3] = 20;
        b[4] = 25;

        // int b[] = new int {5, 10, 15, 20, 25} ;

        int b_total = b[0] + b[1] + b[2] + b[3] + b[4]; // 이런 연산은 for문으로 가능하지 않음
        System.out.println("배열 요소들의 합: "+ b_total);


        System.out.println("===== 두 번째 풀이 =====");

        int result = 0;
//        result = result + b[0];
//        result = result + b[1];
//        result = result + b[2];
//        result = result + b[3];
//        result = result + b[4];

        for (int i = 0; i < 5; i++) {
            result = result + b[i];
            System.out.println("배열 요소들의 합: " + result); // 중간과정도 보기
        }
        System.out.println("배열 요소들의 합: "+ result); // 맨 끝의 과정을 출력하기


//        아래처럼 쓰면 for문을 잘못 쓴 것
//        for (int i = 0; i < b.length; i++) {
//
//            System.out.println("배열 요소들의 합: "+ b_total);
//        }


    }
}
