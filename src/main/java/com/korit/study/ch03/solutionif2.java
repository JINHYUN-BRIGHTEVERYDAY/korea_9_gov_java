package com.korit.study.ch03;

import java.util.Scanner;

// 정수 1개를 입력받아서 그 수가 3의 배수인지를 판별하라
public class solutionif2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수입력: ");
        int num = scanner.nextInt();

        if (num % 3 == 0) {
            System.out.println("이 수는 3의 배수입니다.");
        } else {
            System.out.println("이 수는 3의 배수가 아닙니다.");
        }

        scanner.close();
    }
}
