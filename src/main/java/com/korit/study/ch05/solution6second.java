package com.korit.study.ch05;

public class solution6second {
    public static void main(String[] args) {
        /*
        *

        문제 6: 특정 값 개수 세기
        {3, 7, 3, 9, 3, 1, 3, 5}`에서 숫자 3이 몇 개 있는지 세는 프로그램을 작성하세요.

        * * */

        int[] num = new int[]{3, 7, 3, 9, 3, 1, 3, 5};

        int sum = 0;
        System.out.println("특정 값 개수 세기 시작");

        System.out.println("1의 개수 세기 프로그램을 작성합니다.");

        int[] arr1 = new int[0];
        int[] arr2 = new int[0];
        int[] arr3 = new int[0];

//        int[] count1s = new int[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1) {
                int[] temp = new int[arr1.length + 1];
                for (int j = 0; j < arr1.length; j++) {
                    temp[j] = arr1[j];
                }
                temp[temp.length - 1] = num[i];
                arr1 = temp;
            } else if (num[i] == 2) {
                int[] temp = new int[arr2.length + 1];
                for (int j = 0; j < arr2.length; j++) {
                    temp[j] = arr2[j];
                }
                temp[temp.length - 1] = num[i];
                arr2 = temp;
            } else if (num[i] == 3) {
                int[] temp = new int[arr3.length + 1];
                for (int j = 0; j < arr3.length; j++) {
                    temp[j] = arr3[j];
                }
                temp[temp.length - 1] = num[i];
                arr3 = temp;
            }
        }

    }

}
//        for (int i = 0; i < arr1; i++) {
//
//        }

