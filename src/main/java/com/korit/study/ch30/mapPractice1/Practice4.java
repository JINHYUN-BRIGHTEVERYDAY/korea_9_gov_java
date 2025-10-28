package com.korit.study.ch30.mapPractice;

/*

문제 4: 가격에 세금 추가


List<Double> prices = Arrays.asList(100.0, 200.0, 150.0, 300.0);



각 가격에 10% 세금을 추가한 최종 가격 리스트를 생성하세요.

예상 출력: [110.0, 220.0, 165.0, 330.0]

*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice4 {
    public static void main(String[] args) {
        List<Double> prices = Arrays.asList(100.0, 200.0, 150.0, 300.0);

        List<Double> percentages = prices.stream()
                .map(price -> (price) + (price * 0.1))
                .collect(Collectors.toList());

        System.out.println(percentages);

    }
}
