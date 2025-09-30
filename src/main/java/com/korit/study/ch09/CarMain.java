package com.korit.study.ch09;




class Car { // 클래스 정의
    String model;
    String color;
}


public class CarMain {

    public static void main(String[] args) {
        String model1 = "소나타";
        String color1 = "검정색";
        String model2 = "아반떼";
        String color2 = "파랑색";

        String[] models = new String[100000];
        String[] colors = new String[100000];
        models[99954] = "소나타";
        colors[99954] = "검정색";

        Car c1 = new Car(); // 객체 선언
        c1.model = "소나타";
        c1.color = "검정색";

        Car c2 = new Car(); // 객체 선언
        c2.model = "아반떼";
        c2.color = "파랑색";

        Car c3 = new Car();
        System.out.println(c3.model);
        // 초기화하지 않았지만 오류가 나지 않음
        // 초기화가 자동으로 이루어지게 된다

        // 기본값으로 인스턴스를 초기화한다

        /*
         * 기본값
         * int -> 0
         * double -> 0.0
         * String -> null
         * Char -> 0 ('\u0000')
         * boolean -> false
         *
         * */
    }
}
