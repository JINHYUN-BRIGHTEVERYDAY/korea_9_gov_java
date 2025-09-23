package com.korit.study.ch04;

public class Controller05 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // 1부터 커지도록
            System.out.println(i + 1);
        }

//        for (int i = 5; i > 0; i--) { //5부터 작아지도록
//            System.out.println(i);
//        }

        for (int i = 0; i < 5; i++) {
            System.out.println(5 - i);
        }

//        for (int i = 1; i <= 5; i++) { // 1부터 커지도록
//            for (int j = 5; j < 5 - i;) { //5부터 작아지도록
//                System.out.println(i);
//                System.out.println(j);
//            }
//        }


        /*
        1
        2
        3
        4
        5
        5
        4
        3
        2
        1
        */
    }
}
