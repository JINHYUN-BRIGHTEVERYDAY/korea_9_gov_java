package com.korit.study.ch18;


// 전자기기라는 추상클래스는 전원이라는 인터페이스를 상속받음
public abstract class 전자기기 implements 전원 {
    private int 전압; // 멤버변수


    public 전자기기(int 전압) { // 생성자
        this.전압 = 전압;
    }

    public int get전압() { // getter 생성
        return 전압;
    }
}
