package com.korit.study.ch29.람다연습문제;

interface StringProcessor {
    String process(String str);
}

interface NumberChecker {
    boolean check(int num);
}

interface Printer {
    void print();
}


public class LambdaExercise1 {
    public static void main(String[] args) {

        // 1번: 문자열을 대문자로 변환
//        StringProcessor upperCase = (str)  ->  str.toUpperCase();
        StringProcessor upperCase = str  ->  str.toUpperCase();
        System.out.println(upperCase.process("hello"));

        // 2번: 숫자가 짝수인지 확인
        NumberChecker isEven = (num)  -> (num % 2 == 0);
        System.out.println(isEven.check(10));

        // 3번: 환영 메시지 출력
        Printer welcome = () ->
                System.out.println("환영합니다");
        welcome.print();
        };

}
