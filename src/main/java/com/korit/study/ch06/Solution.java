package com.korit.study.ch06;

public class Solution {
//    요구사항:
//    정수를 받아서 짝수인지 판별하는 메서드를 작성하세요. 짝수면 true, 홀수면 false를 반환합니다.

    public static boolean isEven(int number) {
        if(number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isEven(3));
    }
}
