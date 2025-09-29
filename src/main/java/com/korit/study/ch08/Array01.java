package com.korit.study.ch08;

import java.util.Random;
import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        // 묶어 놓고 반복을 통해서 순서대로 데이터를 사용하려고
        // 배열 -> 아래는 선언만 하고 초기화는 하지 않음
        int[] a = new int[3];
        double[] b = new double[3];
        boolean[] c = new boolean[3];
        String[] d = new String[3];
        Scanner[] e = new Scanner[3];
        Random[] f = new Random[3];

        // 값
        int a2 = 10;
        double b2 = 10.5;
        boolean c2 = true;
        String d2 = "";
        Scanner e2 = new Scanner(System.in);
        Random f2 = new Random();


        System.out.println(d[0]);
        System.out.println(f[0]);
        System.out.println(c[0]);

    }
}
