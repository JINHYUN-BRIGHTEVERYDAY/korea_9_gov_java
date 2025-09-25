package com.korit.study.ch06;

import java.util.Date;

public class 메서드연습문제3 {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        System.out.println(currentTime(11, 39));
    }

    public static String currentTime(int hours, int minutes) {
        Date now = new Date();
        int nowHours = now.getHours();
        int nowMinutes = now.getMinutes();

        return hours == nowHours && minutes == nowMinutes ? "현재 시간입니다." : "현재 시간이 아닙니다";
    }


}
