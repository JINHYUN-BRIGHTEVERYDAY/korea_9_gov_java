package com.korit.study.ch30.mapPractice;
/*

문제 3: 문자열 길이 추출


List<String> words = Arrays.asList("Java", "Stream", "API", "Programming");



각 단어의 길이를 추출하여 정수 리스트를 생성하세요.

예상 출력:[4, 6, 3, 11]

* */


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Programming");

        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(wordLengths);
    }
}
