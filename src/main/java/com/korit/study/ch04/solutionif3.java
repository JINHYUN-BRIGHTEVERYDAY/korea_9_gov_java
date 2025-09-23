package com.korit.study.ch04;


import java.util.Scanner;

/*
* 학교에서 1학년부터 4학년까지 중간고사 시험을 보았다.
* 4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다.
* 이를 판단하는 프로그램을 작성하자.
* 점수가 0미만 100초과이면 경고문구를 출력하도록 한다.
* */
public class solutionif3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학년을 입력하세요: ");
        int grade = scanner.nextInt();

        System.out.print("성적을 입력하세요: ");
        int score = scanner.nextInt();

        if (score >= 0  && score <= 100) {
            if (grade == 4) {
                if (score >= 70) {
                    System.out.println("합격");
                } else {
                    System.out.println("불합격");
                }
            } else if (grade == 3){
                if (score >= 60) {
                    System.out.println("합격");
                } else {
                    System.out.println("불합격");
                }
            } else if (grade == 2) {
                if (score >= 60) {
                    System.out.println("합격");
                } else {
                    System.out.println("불합격");
                }
            } else if (grade == 1) {
                if (score >= 60) {
                    System.out.println("합격");
                } else {
                    System.out.println("불합격");
                }
            }
        } else {
            System.out.println("잘못된 입력값입니다. 다시 확인해주세요");
        }
    }

}
