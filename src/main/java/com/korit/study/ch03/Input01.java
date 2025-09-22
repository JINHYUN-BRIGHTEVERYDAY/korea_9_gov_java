package com.korit.study.ch03;

import java.io.InputStream;
import java.util.Scanner;

public class Input01 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Scanner s = new Scanner(inputStream);
        String str = s.next();
        System.out.println("입력값: " + str);
        s.nextLine();
        String address = s.nextLine();
//        String address = s.next();
//        System.out.println("주소: " + address + s.next()); // 스페이스바를 무시함
//        System.out.println("주소: " + address + s.nextLine());
        System.out.println("주소: " + address);
//        System.out.println(s.next());

    }
}
