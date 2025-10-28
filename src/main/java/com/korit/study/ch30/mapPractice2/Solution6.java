package com.korit.study.ch30.mapPractice2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* 문제 6. 나이를 출생연도로 변환하기
*
* 각 나이를 출생연도로 변환하기
*
* */
public class Solution6 {
    public static void main(String[] args) {
        List<Integer> ages = Arrays.asList(25, 30, 35, 20, 45);
        int currentYear = 2024;

        List<Integer> year =  new ArrayList<>();
        year.add(currentYear);

        List<Integer> years = ages
                .stream()
                .map(y -> currentYear - y)
                .toList();

        System.out.println(years);

    }
}
