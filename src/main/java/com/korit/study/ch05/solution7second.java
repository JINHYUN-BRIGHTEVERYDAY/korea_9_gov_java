package com.korit.study.ch05;

public class solution7second {
    public static void main(String[] args) {
        int[] 기본급 = {10000, 20000, 30000};
        double 세율 = 0.15;
        int[] 지급액 = new int[3];

        /*
        * 이 사이에 들어갈 반복문을 작성
        * 세금은 제외되어야 한다
        * */

        System.out.println("========== 지급액 계산 결과 계산합니다 ==========");

        int[] 세금 = new int[3];

        for (int i = 0; i < 기본급.length; i++) {
           세금[i] = (int) (기본급[i] * 세율);
//           System.out.println("세금[" + i + "] = " + 세금[i]);
           int 실수령액 = 기본급[i]-세금[i];
           지급액[i] = 실수령액;
            System.out.println("지급액[" + i + "] = " + 지급액[i] + " 원");
        }


        System.out.println("========== 지급액 계산 결과 출력합니다 ==========");


        for (int i = 0; i < 지급액.length; i++) {
            System.out.println("지급액[" + i + "] = " + 지급액[i] + " 원");
        }
    }
}
