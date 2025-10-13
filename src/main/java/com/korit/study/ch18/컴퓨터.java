package com.korit.study.ch18;


// public class 컴퓨터 implements 전원
// -> 전자기기는 전원을 상속받고 있음
// 그러면 중간 다리 역할로 조명은 전자기기를 상속받을 수 있음

public class 컴퓨터 extends 전자기기 {


    // 그러나 전자기기는 추상메서드였으므로 전자기기의 추상메서드를 반드시 정의해야 함
    // 정의되지 않았던 전압 메서드를 호출하여 재정의한다
    public 컴퓨터(int 전압) {
        super(전압);
    }


    // 추상클래스를 상속받으므로 반드시 메서드 정의해야
    // 추상클래스에 있었던 메서드 정의한 것 Override
    @Override
    public void 켠다() {
        System.out.println("컴퓨터 전원을 켭니다");
    }

    @Override
    public void 끈다() {
        System.out.println("컴퓨터 전원을 끕니다");
    }


    // 컴퓨터 자체에만 있는 메서드
    public void 바이오스부팅() {
        System.out.println("바이오스 세팅으로 들어갑니다.");
    }
}
