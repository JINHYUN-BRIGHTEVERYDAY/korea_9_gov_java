package com.korit.study.ch04;

public class Controller06 {
    public static void main(String[] args) {
        // 중첩 반복문
//        for (int i = 0; i < 5; i++ ) {
//            System.out.println("i = " + i);
//            for (int j = 0; j < i; j++) {
//                System.out.println("j = " + j);
//            }
//        }

        /*구구단*/
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j <10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println("----------------");
        }
    }
}
