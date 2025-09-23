package com.korit.study.ch04;

import java.util.Scanner;

public class Controller03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isOpen = false;


//         while은 조건이 참일 때 실행되는데 계속 실행되도록
//         조건에 의해서 제어되는
//         거짓이면 실행되지 않는다


        while (isOpen) {
            System.out.println("문을 열고 들어왔습니다.");
            System.out.print("문을 닫으시겠습니까?(y/n)");
            String cmd = scanner.nextLine();
            isOpen = !"y".equals(cmd);
            System.out.println("1111");
        }
        System.out.println("문을 닫고 나왔습니다.");


        while (true) {
            System.out.println("문을 열고 들어왔습니다.");
            System.out.print("문을 닫으시겠습니까?(y/n)");
            String cmd = scanner.nextLine();
            if ("y".equals(cmd)) {
                break;
            }
            System.out.println("2222");
        }


        while (true) {
            System.out.println("첫 번째 반복 y/n: ");
            String cmd = scanner.nextLine();
            if ("y".equals(cmd)) {
                while(true) {
                    System.out.println("두 번째 반복 y/n: ");
                    String cmd2 = scanner.nextLine();
                    if ("n".equals(cmd2)) {
                        break;
                    }
                }
            } else {
                System.out.println("종료");
                break;
            }
        }
    }
}
