package com.korit.study.ch05;

public class Array01 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;

        // 묶음 하나로 대입
        // 배열 -> 묶여있음, 묶여있지 않으면 대입되지 않음
        // 관련 있는 것끼리 묶음

        /*
        * 배열을 나타내는 세 가지 방법
        *
        * int[] nums = {1, 2, 3};
        * int[] nums2 = new int[] {1, 2, 3};
        * int[] nums3= new int[3];
        *
        * */

        int[] nums = { 1, 2, 3 };
        int[] nums2 = new int[] {1, 2, 3};
        //int [] nums4 = new int[] {1,2,3,4,5};
        //int [] nums4 = {1,2,3,4,5};

        int[] nums3 = new int[3];
        nums3[0] = 1;
        nums3[1] = 2;
        nums3[2] = 3;

//        System.out.println(new int[] {1, 2, 3}[0]);
        // System.out.println({1, 2, 3});

        for (int i = 0; i < 3; i++) {
//            System.out.println(nums[i]);
        }

        String[] names = new String [] { "김준일", "김준이", "김준삼" };
        for (int i = 0; i < 3; i++) {
            System.out.println("이름: " + names[i]);
        }
    }
}
