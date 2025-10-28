package com.korit.study.ch30.mapPractice2;

/*

문제 8. 학생 성적 등급 변환

각 학생을 "{이름} : {등급}" 형식으로 변환하기
등급 기준 : 90 이상  A, 80 이상 B, 70 이상 C, 그 외 D 예상 출력하기

*/

import java.util.Arrays;
import java.util.List;

class Student {
    String name;
    int score;

    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

}

public class Solution8 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("김철수", 95),
                new Student("이영희", 82),
                new Student("박민수", 76),
                new Student("정지원", 68)
        );


    }
}
