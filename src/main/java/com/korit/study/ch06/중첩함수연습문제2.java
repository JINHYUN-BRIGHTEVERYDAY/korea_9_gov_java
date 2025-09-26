package com.korit.study.ch06;

/*

계산기 함수

public static int add(int a, int b) { return a + b; }
public static int multiply(int a, int b) { return a * b; }
public static int subtract(int a, int b) { return a - b; }

// (a + b) * c - d 를 계산하는 함수를
// 위의 함수들을 이용해서 작성하세요
public static int calculate(int a, int b, int c, int d) {
    // 여기에 중첩 함수 호출 코드 작성
}


*/


public class 중첩함수연습문제2 {

    public static void main(String[] args) {
        System.out.println(calculate(5,10,15,20));
    }



    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int calculate(int a, int b, int c, int d) {
        // 여기에 중첩 함수 호출 코드 작성
        // (a + b) * c - d 를 계산하는 함수를
        // 위의 함수들을 이용해서 작성하세요

        /*
        * int addResult = add(a,b);
        * int mulResult = multiply(addResult, c);
        * int subResult = substact(mulResult, d);
        *
        * */

        return subtract(multiply(add(a,b),c),d);
    }

}
