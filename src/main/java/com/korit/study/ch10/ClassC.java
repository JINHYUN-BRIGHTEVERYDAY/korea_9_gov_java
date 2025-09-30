package com.korit.study.ch10;

public class ClassC {
    String name;
    int age;
    String address;


    // 생성자 정의하기
    // this 쓰기

    ClassC() {

    }

    ClassC(String name) {
        this.name = name;
    }

    ClassC(int age) {
        this.age = age;
    }

    ClassC(String name, int age){
        this.name = name;
        this.age = age;
    }

    ClassC(int age, String address) {
        this.age = age;
        this.address = address;
    }

    ClassC(String name, String address) {
        this.name = name;
        this.address = address;
    }

    ClassC(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // 생성자 오버로딩


}

// 생성자를 생성하여 이름과 나이를 받도록 하기

