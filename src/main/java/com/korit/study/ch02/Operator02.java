package com.korit.study.ch02;

public class Operator02 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(i);

        i = i + 1;
        System.out.println(i);

        i += 1 ;
        System.out.println(i);


        ++i;
        System.out.println(i);

        i++;
        System.out.println(i);


        System.out.println(++i);

        // 더해지지 않았음
        System.out.println(i++);

        // 연산자 -> 선증가와 후증가

        // 더해졌음
        System.out.println(i);
    }
}
