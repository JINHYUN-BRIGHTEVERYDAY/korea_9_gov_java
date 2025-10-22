package com.korit.study.ch23;

import java.util.ArrayList;

public class WrapperMain {
    public static void main(String[] args) {
        int num = 10;
        Integer num2 = 10; //autoBoxing

//        Integer num3 = new Integer(10); -> 지원 중단
        // 일반 자료형을 참조 자료형태로 매핑하기
        int num4 = num2; //autoUnBoxing

        // 일반 자료형 상황
//        String numStr1 = num;
//        String numStr = num2.toString();
        String numStr = Integer.toString(num);

        String numStr2 = "" + num;

        String numStr3 = num2.toString();


        // 컬렉션
//        ArrayList list = new ArrayList();

        /*
        일반 타입과 참조 타입

        참조 - 값과 기능


        */


        double x = 10.0;
        Double x2 = x;
        System.out.println(x2);


        boolean y = true;
        Boolean y2 = y;
        System.out.println(y2);




        /*

        <> 으로 안에 타입을 명시해주지 않으면 object가 된다
        꺽새 안을 비워두기
        Generic<String, Integer> e = new Generic<String, Integer>("문자열 데이터", "", 3.14, 10);

        int, Integer
        Generic<String, Integer> f = new Generic<>("문자열 데이터", "", 3.14, 10);

        */

    }
}
