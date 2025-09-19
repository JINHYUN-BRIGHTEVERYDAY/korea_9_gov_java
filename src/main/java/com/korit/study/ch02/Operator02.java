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
        // ++i 명령이 끝나기 전에 더하기, i++ 명령이 끝난 후에 더하기
        // i++ 선증가

        System.out.println(i++ + 10);
        // 선증가, 후증가 왜 썻는지 코드 잘 해석해야
        // 반복할 때 사용

        // 더해졌음
        System.out.println(i);
    }
}
