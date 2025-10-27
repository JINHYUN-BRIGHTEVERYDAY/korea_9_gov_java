package com.korit.study.ch28.연습문제;

public class Button implements  ClickListener{
    public ClickListener listener;

    @Override
    public void onClick() {
//        listener.onClick();
        System.out.println("버튼이 클릭되었습니다");
    }

    public void setClickListener(ClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        if (listener != null) {
            listener.onClick();
        }
    }
}
