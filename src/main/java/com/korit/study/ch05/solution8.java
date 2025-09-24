package com.korit.study.ch05;

public class solution8 {
    public static void main(String[] args) {
    /*
    * 문제 8: 두 배열의 합 만들기
    * 두 개의 정수형 배열 arr1 = {1,2,3,4,5}, arr2={6,7,8,9,10}이 있을 때
    * 같은 인덱스의 요소들을 더한 새로운 배열을 만들어 출력하는
    * 프로그램을 작성하세요
    * */

        int[] arr1 = new int[] {1,2,3,4,5};
        int[] arr2 = new int[] {6,7,8,9,10};

        System.out.print("합 배열: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr1[i] + arr2[j] + " ");
            }
        }
    }
}
