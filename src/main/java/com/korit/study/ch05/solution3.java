package com.korit.study.ch05;

public class solution3 {
    public static void main(String[] args) {
        /* 문제3 : 배열에서 최댓값 찾기
        * 정수형 배열 {23, 45, 12, 67, 34, 89, 11}에서 가장 큰 값을 찾아서 출력하는 프로그램을 작성하세요.
        * */
        int c[] = new int [] {23, 45, 12, 67, 34, 89, 11};

        int max = 0;
        for (int i = 0; i < 7; i++) {
            if (c[i] > max) {
                max = c[i];
            }
        }

        max = 0;
        for (int i = 0; i < 7; i++) {
            max = c[i] > max ? c[i] : max;
        }

/*
        int max = c[0];
        int min = c[0];

        for (int i = 0; i < c.length; i++) {
            if (c[i] > max) {
                c[i] = max;
            }

            if (c[i] < min) {
                c[i] = min;
            }
        }
        System.out.println("최댓값은" + max);
        System.out.println("최솟값은" + min);
*/

        // 배열의 최댓값을 출력하기
    }
}
