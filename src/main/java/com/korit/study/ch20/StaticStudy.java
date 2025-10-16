package com.korit.study.ch20;

public class StaticStudy {

    int age;// 생성해야 사용가능 -> static이 없기 때문에
    static int age2;

    // 정적 자료형으로 사용 -> static
    // 다른 패키지에서도 접근 -> public
    public static void print(String str) {
        System.out.println("문자열 출력: " + str);
    }

    public void print2() {
        System.out.println(age2);
    }

    public static void print3() {
//        System.out.println(age);
    }

    public void print4() {
        System.out.println(age);
    }
}
