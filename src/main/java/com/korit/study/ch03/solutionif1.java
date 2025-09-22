package com.korit.study.ch03;


import java.util.Scanner;

// 정수 1개를 입력받아서 그 수가 50이상의 수인지 50미만의 수인지 판별하라
public class solutionif1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요: ");
        int num = scanner.nextInt();

        if (num >= 50) {
            System.out.println("50이상입니다.");
        } else {
            System.out.println("50미만입니다.");
        }
        scanner.close();
    }
}
