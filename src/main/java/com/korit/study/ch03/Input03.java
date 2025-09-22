package com.korit.study.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Input03 {
    public static void main(String[] args) throws IOException {
//        InputStream inputStream = System.in;
//        // 객체 생성
//        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // 한 줄로 쓰면?
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int n = 10;
//        System.out.println(n);
        String line = bufferedReader.readLine(); //예외처리 IOException 임포트하기
//        System.out.println(line);
        String[] datas = line.split(" ");
        Arrays.stream(datas).forEach(System.out::println);

    }
}
