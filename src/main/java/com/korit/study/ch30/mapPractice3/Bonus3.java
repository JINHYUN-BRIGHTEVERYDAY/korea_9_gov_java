package com.korit.study.ch30.mapPractice3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/*
* 토요일과 일요일만 필터링하세요.
* 예상 출력: [2024-01-06, 2024-01-07, 2024-01-13, 2024-01-14]
* 힌트: getDayOfWeek() 활용
*
* */

public class Bonus3 {
    public static void main(String[] args) {
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2024, 1, 1),  // 월요일
                LocalDate.of(2024, 1, 6),  // 토요일
                LocalDate.of(2024, 1, 7),  // 일요일
                LocalDate.of(2024, 1, 10), // 수요일
                LocalDate.of(2024, 1, 13), // 토요일
                LocalDate.of(2024, 1, 14)  // 일요일
        );


        System.out.println(LocalDate.of(2024,1,6).getDayOfWeek());


        List<LocalDate> filteringDates = dates.stream()
                .filter(localDate -> localDate.getDayOfWeek().name().equals("SATURDAY")
                        ||  localDate.getDayOfWeek().name().equals("SUNDAY"))
                                .toList();

        System.out.println(filteringDates);

    }
}
