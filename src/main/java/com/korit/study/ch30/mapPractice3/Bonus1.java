package com.korit.study.ch30.mapPractice3;

/*

  null이 아닌 값만 필터링하기

  null이 아니고 빈 문자열도 아닌 값만 필터링하세요

*/

import java.util.Arrays;
import java.util.List;

public class Bonus1 {
    public static void main(String[] args) {
        System.out.println("null이 아니고, 빈 문자열도 아닌 값만 필터링 하세요");
        List<String> data = Arrays.asList("apple", null, "banana", "", null, "cherry", "");
        data.stream().filter(dataFilter -> !dataFilter.equals("") )
                .forEach(System.out::println);
    }
}
