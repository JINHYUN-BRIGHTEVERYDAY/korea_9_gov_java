package com.korit.study.ch04;

import java.util.Scanner;

// 문제4: 사용자로부터 세 개의 정수를 입력받아서, 그 수들의 최댓값과 최솟값, 합계 구하기
public class solutionif4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("세 개의 정수를 입력하겠습니다.");
        System.out.print("첫 번째 정수를 입력해주세요: ");
        int firstNumber = scanner.nextInt();
        System.out.print("두 번째 정수를 입력해주세요: ");
        int secondNumber = scanner.nextInt();
        System.out.print("세 번째 정수를 입력해주세요: ");
        int thirdNumber = scanner.nextInt();

        // 평균 구하기
        int sum = firstNumber + secondNumber + thirdNumber;
        double avg = sum / 3;
        System.out.println("세 수의 평균은 " + avg + "입니다");

        // 최댓값
        int max = firstNumber;

        if (thirdNumber > secondNumber) {
            if (secondNumber > max) {
                max = thirdNumber;
            } System.out.println("이 경우 최댓값은 " + max + "입니다");
        } else if (secondNumber > thirdNumber) {
            if (secondNumber > firstNumber) {
                max = secondNumber;

            } System.out.println("이 경우 최댓값은 " + max + "입니다");
        }
        System.out.println("최댓값 출력이 모두 끝났습니다.");

        scanner.close();
    }

//    https://ubange.tistory.com/186
//    https://ubange.tistory.com/188


}
