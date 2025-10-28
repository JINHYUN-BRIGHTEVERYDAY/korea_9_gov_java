package com.korit.study.ch30.mapPractice2;

/*

문제 1: 문자열 첫 글자 추출

List<String> cities = Arrays.asList("Seoul", "Busan", "Incheon", "Daegu", "Gwangju");

각 도시명의 첫 글자만 추출하여 문자 리스트를 생성하세요

예상 출력: [S, B, I, D, G]

*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Seoul", "Busan", "Incheon", "Daegu", "Gwangju");

        List<Character> firstCharacters = words.stream()
                .map(s -> s.charAt(0))
                .collect(Collectors.toList());

        System.out.println(firstCharacters);

    }
}
