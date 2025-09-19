package com.korit.study.ch02;

public class Operator05 {
    public static void main(String[] args) {
//         조건 연산자
//        boolean a = 10 > 0;
//        삼항연산자는 결과값에 초점을 맞추고 자료형 맞추기

        String r = 10 > 0 ? "0보다 크다" : "0보다 작다";
        System.out.println(r);

        double r2 = 10 > 0 ? 1.1 : 1.2;
        System.out.println(r2);

        char r3 = 10 > 0 ? 'o' : 'x';
        System.out.println(r3);

        String r4 = -10 > 0 ? "0보다 크다" : (-10 > -20 ? "-20보다 더 크다" : "작다");
        // 조건 중첩이 가능하다
        System.out.println(r4);

        String r5 = 2002 % 100 == 0 ? "100의 배수" : "100의 배수가 아니다";
        System.out.println(r5);


//        연습문제
        int year1 = 1999;
        int year2 = 2024;
        //윤년인지 아닌지 확인하세요. (윤년의 조건은 4의 배수이면서 100의 배수가 아니거나) 또는 400의 배수 이면 윤년, 아니면 평년으로 처리

        //윤년입니다. 또는 평년입니다. 결과 출력하기

        // 1999년
        String result1 = (((year1 % 4 == 0) && (year1 % 100 != 0)) || (year1 % 400 == 0)) ? "윤년입니다" : "평년입니다";
        System.out.println(result1);

        //2024년
        String result2 = (((year2 % 4 == 0) && (year2 % 100 != 0)) || (year2 % 400 == 0)) ? "윤년입니다" : "평년입니다";
        System.out.println(result2);



//        연습문제 2
        int 현재잔액 = 150000;
        int 출금금액1 = 149000;
        int 수수료 = 1000;

        String 상태 = (현재잔액-(출금금액1+수수료))>=0 ? "성공" : "실패"; // 성공, 실패
        System.out.println("거래 상태: " + 상태);

        int 출금액 = (출금금액1 + 수수료) <= 현재잔액 ? 현재잔액 : 0; // 수수료 1000원 포함
        System.out.println("출금액: " + 출금액 + "원 (수수료 1000원 포함)");

        String 거래후잔액 = (현재잔액-출금액)>=0 ? "현재잔액은 " + (현재잔액-출금액)  : "잔액부족으로 출금할 수 없습니다.";
        String 최종금액 = 거래후잔액;
        System.out.println("거래 후 잔액: " + 최종금액 + "원 입니다");






    }
}
