package com.korit.study.ch02;

import java.sql.SQLOutput;

public class Operator04 {
    public static void main(String[] args) {

//       대소,관계 연산자

        int a = 10;
        int b = 2;

        boolean c = a > b;
        boolean d = a < b;
        boolean e = a >= b;
        boolean f = a <= b;
        boolean g = a == b;
        boolean h = a != b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);


//        연습문제

        int n = 10;

//        boolean i = n >= 5;
//        boolean j = n <= 15;

//        boolean r = 5 <= n <= 15; -> 에러 발생

        boolean r = n >= 5  && n <= 15;
        // 5 ~ 15 사이면 n의 값이 true;
        // n이 5보다 큰 범위와 15보다 작은 범위를 만족해야 한다

        System.out.println(r);



        a = 10;
        b = 10;
        System.out.println(a == b);

//        System.out.println(false == false);
//        System.out.println(true == true);
//        System.out.println("a" == "a");
//        System.out.println('a' == 'a');

//        System.out.println("a".equals("a"));


//        연습문제2
        int 키 = 170;
        int 몸무게 = 65;

//        double BMI = 몸무게 / (((double) 키 / 100.0) * ((double) 키 / 100.0)));
        double BMI = 몸무게 / ((키 / 100.0) * (키 / 100.0)); // 키에서 100을 나눈 결과의 제곱을 몸무게에서 나눈 결과
        boolean 저체중 = BMI < 18.5; // 18.5 미만
        boolean 정상 = BMI >= 18.5 && BMI <= 24.9 ; // 18.5에서 24.9 사이
        boolean 과체중 = BMI >= 25 && BMI <= 29.9; // 25에서 29.9 사이
        boolean 비만 = BMI >= 30; // 30 이상

        // 정수끼리, 소수점끼리 차이

        System.out.println(BMI);
        System.out.println("저체중: " + 저체중);
        System.out.println("정상: " + 정상);
        System.out.println("과체중: " + 과체중);
        System.out.println("비만: " + 비만);


//        연습문제3 : 급여 계산 (근로기준법 총 근로시간 40시간, 나머지는 시간외 근무시간)

        int 기본급 = 2400000 ;
        System.out.println("기본급: " + 기본급 + "원" );

        int 근무시간 = 52 * 4 ;
        System.out.println("근무시간: " + 근무시간 + "시간" );

        int 기본근로시간 = 40 * 4;
        System.out.println("기본근로시간: " + 기본근로시간 + "시간" );

        int 추가근로시간 = (근무시간) - (기본근로시간);
        System.out.println("추가근로시간: " + 추가근로시간 + "시간");

        // 주당 40시간 근무, 나머지가 시간외 근무시간

        int 기본시급 = 기본급 / 기본근로시간;
        System.out.println("기본시급: " +  기본시급 + "원");

        int 추가수당 = (int)(기본시급 * 1.5);
        System.out.println("추가수당: " + 추가수당 + "원");


        int 총급여 = 기본급 + ((int)(추가근로시간)*(추가수당)); // 기본급 + (시간외 수당 * 1.5)
        System.out.println("총급여: " + 총급여 + "원");

        int 세금 = (int)(총급여*0.1); // 총급여의 10%
        System.out.println("세금: " + 세금 + "원");

        int 지급급여 = 총급여-세금; // 총급여 - 세금
        System.out.println("지급급여: " + 지급급여 + "원");

    }
}
