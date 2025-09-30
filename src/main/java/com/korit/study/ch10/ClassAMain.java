package com.korit.study.ch10;

public class ClassAMain {

    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.name = "김준일";
        a.age = 32;

        ClassB b = new ClassB("김준이", 33);
        // 생성자에게 그 데이터를 준다
        System.out.println(b.name);
        System.out.println(b.age);


        // 생성자를 생성하여 이름과 나이를 받도록 하기
        ClassC c = new ClassC("진현", 30 );
        System.out.println(c.name);
        System.out.println(c.age);

        ClassC c2 = new ClassC("진현", 30, "김해");
        System.out.println(c2.name);
        System.out.println(c2.age);
        System.out.println(c2.address);

        ClassC c3 = new ClassC();

    }

}
