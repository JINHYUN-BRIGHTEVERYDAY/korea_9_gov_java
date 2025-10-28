package com.korit.study.ch30.mapPractice;

/*

문제 2: 숫자 제곱 계산**

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

각 숫자의 제곱을 계산하여 새로운 리스트를 생성하세요.

예상 출력:[1, 4, 9, 16, 25]

*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        List<Integer> squearedNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(squearedNumbers);
    }
}
