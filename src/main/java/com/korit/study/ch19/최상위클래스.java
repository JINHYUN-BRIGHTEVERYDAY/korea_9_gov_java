package com.korit.study.ch19;

import java.util.Scanner;

// 모든 자료형의 상위 => Object
public class 최상위클래스 {
    public static void main(String[] args) {
        int a = 10;
        double b = a;

        // 모든 자료형의 상위 => Object
        Object c = a;
        Object d = b;
        Object e = "test";
        String f = "abc";

        Car car = new Car("k3", "화이트"); // Car 객체 생성
        Car car2 = new Car("k3", "화이트");
        Object g = (Object) car;

        // car의 자료형은 Car, 따라서 String과 자료형이 일치하지 않는다
        String h = car.toString(); // car 객체는 Object 객체를 상속받음 Object 객체 안의 toString을 호출

        // String h = (String) car;

        // car의 상속된 Object에 있는 toString을 호출하는 것
        //System.out.println(car.toString()); toString 호출이 굳이 불필요하게 됨
        System.out.println(car);
        System.out.println(h);


        String name1 = "김준일";
        String name2 = "김준일";
        boolean result1 = name1 == name2;
        System.out.println(result1);

        // 클래스이므로 생성 가능 - 매개변수 전달 가능
        String name3 = new String("김준일");
        System.out.println(name3 + "입니다.");

        Scanner scanner = new Scanner(System.in);
        String name4 = scanner.nextLine();
        System.out.println(name4);

        // 주소값 비교
//        boolean result2 = name1 == name3;
//        System.out.println(result2);

        // 문자열 비교할 때 equals 쓰기
        boolean result2 = name1.equals(name3);
        System.out.println(result2);
        // equals도 Object의 메서드

//        boolean result3 = name2 == name4;
//        System.out.println(result3);

        boolean result3 = name2.equals(name4);
        System.out.println(result3);

        /*

        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }

        * */

//        계산이 안됨
//        System.out.println(c + d);

    }
}
