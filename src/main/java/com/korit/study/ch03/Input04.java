package com.korit.study.ch03;

import java.util.Scanner;

public class Input04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = "김준일".charAt(0);
        System.out.println(a);
        char b = scanner.next().charAt(0); // 입력받는데 한 글자만 받음
        System.out.println(b);
    }
}
