package com.korit.study.ch30.mapPractice2;

/*
* 문제 2 : 불린 값 반전하기
*
* List<Boolean> flags = Arrays.asList(true, false, true, true, false);
* 각 불린 값을 반대로 변환하기
* */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution2 {
    public static void main(String[] args) {
        List<Boolean> flags = Arrays.asList(true, false, true, true, false);

        List<Boolean> negatedflags = flags.stream()
                .map(b -> !b)
                .collect(Collectors.toList());

        System.out.println("원본 리스트 : " + flags);
        System.out.println("반전된 리스트 : " + negatedflags);
    }

}
