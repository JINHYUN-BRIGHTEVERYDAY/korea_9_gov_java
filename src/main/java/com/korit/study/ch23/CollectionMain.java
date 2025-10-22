package com.korit.study.ch23;

import java.lang.reflect.Array;
import java.util.ArrayList;

// 컬렉션 - 배열 형태의 리스트
public class CollectionMain {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("20");
        list.add(30.5);
        list.add(true);
        // 자료형이 서로 다름

        System.out.println(list);

        // System.out.println(list[0]); -> 배열 문법

        // 꺼내오기 -> 리턴 Object
        // -> Object 형태이므로 다운캐스팅
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));


        // 제네릭 타입을 명시하지 않으면 Object
//        ArrayList<String> strList = new ArrayList<>();
////        new ArrayList<>();
//
//        strList.add("문자열");
//        strList.add("28");
//
//        System.out.println(strList.get(0));

        test(new ArrayList<>());

    }



    public static void test(ArrayList<String> strList) {

    }
}
