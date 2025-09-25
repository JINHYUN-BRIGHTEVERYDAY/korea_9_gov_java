package com.korit.study.ch05;

public class star2 {
    public static void main(String[] args) {

        /*
        *        *
        *       **
        *      ***
        *     ****
        *
        * */

        /*

        i는 공백으로 처리 -> j는 별모양으로 처리
        i = 3 -> j = 1
        i = 2 -> j = 2
        i = 1 -> j = 3
        i = 0 -> j = 4

        */

        for (int i = 3; i <= 0; i--) {
            System.out.println("");
            for (int j = 1; j < i+1; j++) {
                System.out.println("*");
            }
        }

    }
}
