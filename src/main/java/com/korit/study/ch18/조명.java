package com.korit.study.ch18;

public class 조명 extends 전자기기 {


    public 조명(int 전압) {
        super(전압);
    }

    @Override
    public void 켠다() {
        System.out.println("조명 전원을 켭니다");
    }

    @Override
    public void 끈다() {
        System.out.println("조명 전원을 끕니다");
    }

    // 조명에만 있는 메서드
    public void 조명교체필요() {
        System.out.println("조명 교체가 필요합니다.");
    }
}
