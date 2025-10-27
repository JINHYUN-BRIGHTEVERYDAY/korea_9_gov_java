package com.korit.study.ch29.람다연습문제;

interface MathOperation {
    int operate(int a, int b);
}

interface TripleOperation {
    int operate(int a, int b, int c);
}

interface Formatter {
    String format(String name, int age, String city);
}


public class LambdaExercise2 {
    public static void main(String[] args) {
        // TODO 1: 두 수를 더하는 람다 표현식 작성
        MathOperation add = (int a, int b) -> a + b; // 여기에 람다 작성
        System.out.println(add.operate(10, 20));
//        int addResult = add.operate(10, 20);

        // TODO 2: 두 수 중 큰 수를 반환하는 람다 표현식 작성
        MathOperation max = (int a, int b) -> a > b ? a : b; // 여기에 람다 작성
        MathOperation max2  = (int a, int b) -> Math.max(a,b);
//        System.out.println(max.operate(10, 20));


        // TODO 3: 두 수의 거듭제곱을 계산하는 람다 (a의 b제곱)
        MathOperation power = (int a, int b) -> (int) Math.pow(a, b);// 여기에 람다 작성
        // 힌트: Math.pow() 사용

        /*
        if (n2 == 0) {
            return 1;
        }
        int result = n1;
        for (int i = 0; i < n2; i++) {
            result *= n1;
        }
        return result;
        */

        // TODO 4: 세 수의 평균을 구하는 람다 표현식 작성
        TripleOperation average = (int a, int b, int c) -> (a + b + c)/3; // 여기에 람다 작성

        // TODO 5: 이름, 나이, 도시를 받아서 형식화된 문자열로 만드는 람다
        // 출력 형식: "이름: 홍길동, 나이: 25세, 거주지: 서울"
        Formatter personInfo = ((name, age, city) -> ("이름 : " + name + ", 나이 : " + age + ", 거주지 : " + city)); // 여기에 람다 작성
        // Formatter personInfo = ((name, age, city) -> String.format("이름 : %s, 나이 : %d세, 거주지 : %s", name, age, address));


        System.out.println("10 + 20 = " + add.operate(10, 20));
        System.out.println("15와 27 중 큰 수: " + max.operate(15, 27));
        System.out.println("2의 10제곱: " + power.operate(2, 10));
        System.out.println("10, 20, 30의 평균: " + average.operate(10, 20, 30));
        System.out.println(personInfo.format("홍길동", 25, "서울"));
    }
}
