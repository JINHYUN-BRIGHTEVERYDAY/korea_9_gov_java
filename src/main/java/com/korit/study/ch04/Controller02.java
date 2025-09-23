package com.korit.study.ch04;

import java.util.Scanner;

public class Controller02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름: ");
        String name = scanner.nextLine();

        //switch 문
        switch (name) {
            case "PERSON1" :
                System.out.println("1");
                break;
            case "PERSON2" :
                System.out.println("2");
                break;
            case "PERSON3" :
                System.out.println("3");
                break;
            default:
                System.out.println("나머지");
        }
    }
}
