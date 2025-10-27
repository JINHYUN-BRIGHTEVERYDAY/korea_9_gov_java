package com.korit.study.ch28.연습문제2;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        Calculator calculator = new CalculatorProgram();

        calculator.calculate(10, 5);

        calculator.calculate(10, 5);

        calculator.calculate(10, 5);


        // TODO: 익명 클래스로 덧셈 계산기 구현
        Calculator add = null; // 여기에 구현

        add.calculate(10,5);

        // TODO: 익명 클래스로 뺄셈 계산기 구현
        Calculator subtract = null; // 여기에 구현

        // TODO: 익명 클래스로 곱셈 계산기 구현
        Calculator multiply = null; // 여기에 구현

        System.out.println(x + " + " + y + " = " + add.calculate(x, y));
        System.out.println(x + " - " + y + " = " + subtract.calculate(x, y));
        System.out.println(x + " * " + y + " = " + multiply.calculate(x, y));
    }
}
