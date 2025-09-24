package com.korit.study.ch05;

public class solution5 {
    public static void main(String[] args) {
        /*
        * 문제 5: 배열의 역순으로 출력
        * 정수형 배열 {1,2,3,4,5}의 요소를 역순으로 출력하는
        * 프로그램을 작성하세요
        * */

        int[] e = new int[] {1,2,3,4,5};

        for (int i = 4; i >= 0; i--) {
            System.out.print(e[i] + " ");
        }

    }
}
