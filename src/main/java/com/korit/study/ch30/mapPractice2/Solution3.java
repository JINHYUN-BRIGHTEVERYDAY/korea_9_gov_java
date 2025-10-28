package com.korit.study.ch30.mapPractice2;


/*
*  문제 3 : 온도 단위 변환 (섭씨 -> 화씨)
*
*  List<Double> celsius = Arrays.asList(0.0, 25.0, 100.0, -10.0);
*
* 섭씨 온도를 화씨로 변환하세요.
*
* 공식: (C × 9/5) + 32
* 예상 출력: [32.0, 77.0, 212.0, 14.0]
*
*
* */


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution3 {
    public static void main(String[] args) {
        List<Double> celsius = Arrays.asList(0.0, 25.0, 100.0, -10.0);
        List<Double> Felsius = celsius.stream()
                .map(c -> (c * 9/5) + 32)
                .collect(Collectors.toList());

        System.out.println(Felsius);
    }
}
