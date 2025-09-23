package com.korit.study.ch04;

import java.util.Scanner;

public class GugudanUpsideDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("시작 단을 입력합니다: ");
        int StartDan = scanner.nextInt();

        System.out.print("끝 단을 입력합니다: ");
        int EndDan = scanner.nextInt();

        // 여기에 코드를 작성하세요
        // 입력순서와 Scanner 메서드 조합에 주의할 것


        int danRange = EndDan - StartDan + 1;


        for (int i = 0; i < danRange; i++) {
            int i2 = EndDan -i;
            System.out.println(i2 +"단");
            for (int j = 0; j < 9; j++) {
                int j2 = 9 - j;
                System.out.println(i2 + " x " + j2 + " = " + (i2 * j2));
                // System.out.println("%d* %d = %d", dan, num, num, dan * num);
            }
        }

    }
}
