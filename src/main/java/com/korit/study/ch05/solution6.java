package com.korit.study.ch05;

public class solution6 {
    public static void main(String[] args) {
        /* 문제 6: 특정 값 개수 세기
        * 정수형 배열 {3, 7, 3, 9, 3, 1, 3, 5}에서
        * 숫자 3이 몇 개 있는지 세는 프로그램을 작성하세요.
        *
        */

        int[] f = new int[] {1, 2, 3, 1, 2, 3, 1, 3, 3};

        int count = 0;

        for (int i = 0; i < f.length; i++) {
            if (f[i] == 1) {
                count++;
            }
        }
        System.out.println("숫자 1의 개수: " + count);

//        for (int i = 0; i < f.length; i++) {
//            System.out.println("f[" + i + "] = " + f[i]);
//        }

//        int[] arr1 = new int[count];







        int count2 = 0;

        for (int i = 0; i < f.length; i++) {
            if (f[i] == 2) {
                count2++;
            }
        }
        System.out.println("숫자 2의 개수: " + count2);
        int[] arr2 = new int[count2];

//        for (int i = 0; i < f.length; i++) {
//            System.out.println("f[" + i + "] = " + f[i]);
//        }







        int count3 = 0;

        for (int i = 0; i < f.length; i++) {
            if (f[i] == 3) {
                count3++;
            }
        }
        System.out.println("숫자 3의 개수: " + count3);
        int[] arr3 = new int[count3];

//        for (int i = 0; i < f.length; i++) {
//            System.out.println("f[" + i + "] = " + f[i]);
//        }



/*        for (int i = 0; i < f.length; i++) {
            if (f[i] == 1) {

            } else if (f[i] == 2) {

            } else if (f[i] == 3) {

            }
        }*/


        /*
        * int[] arr1 = new int[0]; //1들만 모으기
        * int[] arr2 = new int[0]; //2들만 모으기
        * int[] arr3 = new int[0]; //3들만 모으기
        *
        * */

    }
}
