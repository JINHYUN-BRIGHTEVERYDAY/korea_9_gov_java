package com.korit.study.ch02;

public class Operator01 {
    public static void main(String[] args) {

//        산술연산자
        int n1 = 10;
        int n2 = 5;
        int r1 = n1 + n2;
        System.out.println(r1);


//        문자열 더하기
        String text1 = "문자열";
        String text2 = "합치기";
        String text3 = text1 + text2;
        System.out.println(text3);
        System.out.println("문자열2" + " " + "합치기2" + text1 + ": " + r1 ); // 공백을 포함

//        연산으로 인한 캐스팅
        double n3 = 2.1;
        int n4 = 10;
        System.out.println(n3 + n4); // 상위의 타입으로 캐스팅 되었다
        // 변수가 더해지는 거싱 아니라 리터럴값이 더해지는것

//        String n5 = 2.1; -> 에러
        String n5 = "" + 2.1; // -> 가능

//        String n5= "2.1";

        double n6 = 10.12;

//        double n7 = n5 + n6; // 합계 결과 문자열이 되기 떄문에 에러

        Double n7 = Double.parseDouble(n5) + n6; // 클래스에서 학습할 예정
        System.out.println(n7);

//        System.out.println(10 + 'a');

        System.out.println((char) (10 + 'a'));
        // 문자 데이터는 아스키 코드에 근거하여 상위로 따라가기
        // 'a'는 97로 변환

        System.out.println('a' + 'b');
        // + 은 수학적 연산과 문자열을 더하는 연산
        // 'a'와 'b'는 문자열이 아님 -> 그러면 수학적연산이므로 숫자로 출력한 결과 아스키코드로 변환한 것
        // 따라서 아스키코드 변환결과

        System.out.println("" + 'a' + 'b');
        // 문자열로 먼저 합쳐지고 문자가 합쳐지는 것 -> ab가 출력

        System.out.println('a' + 'b' + "");
        // 숫자로서 먼저 합쳐지고 문자열이 합쳐지는 것 -> 195로 출력
//        System.out.println('a' + ('b' + "")); -> 산술의 우선순위대로

        // 나머지 구하기
        int n8 = 10;
        int n9 = 2;
        int n10 = n8 % n9;
        System.out.println(n10);


    }
}
