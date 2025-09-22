package com.korit.study.ch03;

import java.util.Scanner;

public class StudentInfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 이름: ");
        String name = scanner.next();

        System.out.print("나이: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("학년: ");
        int grade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("국어 점수: ");
        int Korean_Score = scanner.nextInt();
        scanner.nextLine();

        System.out.print("영어 점수: ");
        int English_Score = scanner.nextInt();
        scanner.nextLine();

        System.out.print("수학 점수: ");
        int Math_Score = scanner.nextInt();
        scanner.nextLine();

        System.out.print("좋아하는 스포츠를 입력하세요: ");
        String sport = scanner.nextLine();
        System.out.println("자기소개를 입력하세요: 안녕하세요! 저는 " + sport + " 를 좋아하는 " + name + " 입니다.");


        System.out.println("                        ");
        System.out.println("                        ");

        System.out.println("=== 학생 정보 ====");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + " 세 " + " ( 고등학교 " + grade + " 학년 ) ");
        System.out.println("성적:");
        System.out.println("    국어: " + Korean_Score + "점");
        System.out.println("    영어: " + English_Score + "점");
        System.out.println("    수학: " + Math_Score + "점");

        double averageScore = (Korean_Score + English_Score + Math_Score)/3;
        String scoreGrade = averageScore >=90 ? "A" :
                averageScore >=80 ? "B" :
                        averageScore >=70 ? "C" :
                                averageScore >=60 ? "D" :
                                        "F";

        System.out.println("평균: " + (double)((Korean_Score + English_Score + Math_Score)/3) + "점" + " (학점: " + scoreGrade + ")");

        System.out.println("자기소개: " + "안녕하세요! 저는 " + sport + "를 좋아하는 " + name + " 입니다.");
    }
}
