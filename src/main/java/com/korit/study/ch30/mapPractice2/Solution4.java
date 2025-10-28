package com.korit.study.ch30.mapPractice2;

/*
* 문제 4: 문자열의 앞뒤 공백을 제거하기
*
* List<String> messyData
*               = Arrays.asList("  hello  ", "world   ", "  java", "   stream   ");
*
* */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution4 {
    public static void main(String[] args) {
        List<String> messyData = Arrays.asList("  hello  ", "world   ", "  java", "   stream   ");

        List<String> strippedList = messyData.stream()
                .map(String:: strip)
                .collect(Collectors.toList());

        System.out.println("원본 리스트 : " + messyData);
        System.out.println("공백 제거된 리스트 : " + strippedList);
    }
}
