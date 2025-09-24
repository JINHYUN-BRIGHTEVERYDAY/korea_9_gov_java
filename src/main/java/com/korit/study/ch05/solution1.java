package com.korit.study.ch05;

public class solution1 {
    public static void main(String[] args) {
        /* 문제 1: 배열의 모든 요소 출력하기
        * 정수형 배열 {10, 20, 30, 40, 50}의 모든 요소를 한 줄에 하나씩 출력하는
        * 프로그램을 작성하시오
        * */

        int a[] = new int [5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

//        System.out.println(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
