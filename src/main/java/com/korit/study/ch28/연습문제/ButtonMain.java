package com.korit.study.ch28.연습문제;

public class ButtonMain {
    public static void main(String[] args) {
        Button button = new Button();

        // TODO: 여기에 익명 클래스를 사용하여 ClickListener 구현
        ClickListener button1 = new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("버튼을 클릭하였습니다");
            }

        };
    }
}
