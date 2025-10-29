package com.korit.study.ch30.mapPractice3;


/*
* 2. 중복되지 않은 숫자 필터링하기

리스트에서 한번만 등장하는 숫자만 필터링하기
Collections.frequency() 활용

* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bonus2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 5, 8);

        List<Integer> filteringNumbers = numbers.stream()
                .filter(num -> numbers.stream().filter(num2 -> num2 == num).count() == 1)
                .toList();

        System.out.println(filteringNumbers);


        // 일반 for문 사용하여 풀이
        List<Integer> filteringNumber2 = new ArrayList<>();
        for (Integer num : numbers) {
            int count = 0;
            for (Integer num2 : numbers) {
                if (num2 == num) {
                    count++;
                }
            }
            if (count == 1) {
                filteringNumbers.add(num);
            }
        }
        System.out.println(filteringNumber2);
    }
}
