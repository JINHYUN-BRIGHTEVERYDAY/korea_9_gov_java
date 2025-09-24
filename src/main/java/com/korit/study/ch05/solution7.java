package com.korit.study.ch05;

public class solution7 {
    public static void main(String[] args) {
        /* 문제 7: 배열의 평균 구하기
        * 정수형 배열 {80, 90, 75, 85, 95}의 평균값을 구해서
        * 소수점 둘째 자리까지 출력하는 프로그램을 작성하세요.
        * */

        int[] g = new int[] {80, 90, 75, 85, 95};

        for (int i = 0; i < g.length; i++) {
        }
        double avg = (g[0] + g[1] +  g[2] + g[3] + g[4]) / 5;
        System.out.println("배열의 평균: " + avg);
    }
}
