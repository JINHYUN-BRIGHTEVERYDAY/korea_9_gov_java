package com.korit.study.ch30.mapPractice1;

/*

문제 1: 문자열 대문자 변환

List<String> names = Arrays.asList("alice", "bob", "charlie", "david");

모든 이름을 대문자로 변환하여 새로운 리스트를 생성하세요.

예상 출력: [ALICE, BOB, CHARLIE, DAVID]

*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "charlie", "david");

        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCaseNames);
    }


}
