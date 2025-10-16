package com.korit.study.ch20;

public class StaticMain {
    public static void main(String[] args) {

        /*
        void print(String str) {
        System.out.println("문자열 출력: " + str);
            }
        */

        StaticStudy staticStudy = new StaticStudy(); // 객체 생성, 동적 메모리


        staticStudy.print("JINHYUN"); // 해당 객체의 메서드 호출
        // System.out.println(staticStudy);
        staticStudy.print("김준일");
        staticStudy.print("김준이");

        staticStudy.age = 10;


        System.out.println(staticStudy.age);


        StaticStudy.age2 = 20; //-> 이제 생성자, 객체생성을 하지 않아도 가능
        // StaticStudy -> 에러, 생성하지 않았기 때문에 static이 없음
        System.out.println(staticStudy.age2);
        System.out.println(StaticStudy.age2);

        staticStudy.age2 = 30;
        System.out.println(StaticStudy.age2); // 생성된게 아님 모든 객체가 다 공유되므로

        StaticStudy s2 = new StaticStudy();
        s2.age = 50;
        System.out.println(staticStudy.age2);

//        Casting.main(null);

        // 두 번 호출한다면

        /*

        new StaticStudy().print("JINHYUN");
        new StaticStudy().print("JINHYUN");

        */

        // 정적메모리할당
        // 가상메모리 피지컬메모리

    }
}
