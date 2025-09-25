package com.korit.study.ch06;

public class Function3 {
    public static void main(String[] args) {
        int r1 = sum(1);
        System.out.println(r1);
        int r2 = sum(10.5);
        System.out.println(r2);
        int r3 = sum(10, 2.5);
        System.out.println(r3);
        int r4 = sum(2.5, 20);
        System.out.println(r4);
    }

    // 메서드 오버로딩
    // 왜 사용하나 : 여러 경우의 수를 처리할 수 있게끔 확장성 있게 사용할 수 있도록
    static int sum(int n) {
        return n + 10;
    }

    static int sum(double n) {
        return (int) (n + 20);
    }

    static int sum(int n1, double n2) {
        return (int) (n1 + n2);
    }

    static int sum(double n1, int n2) {
        return (int) (n1 + n2);
    }
}
