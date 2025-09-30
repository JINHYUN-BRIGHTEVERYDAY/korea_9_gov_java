package com.korit.study.ch11;

public class Student {
    int id;
    String name;
    int age;


    // 학생에 대한 객체 생성

//    Student[] students = new Student[] {student1, student2};

//    Student student = new Student(id, name, age);


    // 과목명 : JAVA 기초
    // 담당 선생님 이름: 김준일
    // 담당 선생님 나이: 32
    // 학생1의 ID: 20250001
    // 학생1의 이름: 박재현
    // 학생1의 나이: 24
    // 학생2의 ID: 20250002
    // 학생2의 이름: 고대한
    // 학생2의 나이: 19
    // 학생3의 ID: 20250003
    // 학생3의 이름: 양재원
    // 학생3의 나이: 27

    // 생성자
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }



}
