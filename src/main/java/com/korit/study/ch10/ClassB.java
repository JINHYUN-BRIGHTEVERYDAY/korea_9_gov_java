package com.korit.study.ch10;

public class ClassB {
    String name;
    int age;


    // 생성자 정의
    ClassB(String name, int age) {
        //this -> 자기자신의 주소
        this.name = name;
        this.age = age;
    }
    
    // 항상 this붙이는 것이 아님

}