package com.korit.study.ch30;

/*

Stream (흐름) -> 한 번 쓰면 다시는 못 쓴다
1. 생성 단계 -> 스트림 객체 생성
2. 중간 연산 단계 -> 변환, 필터링 (반복 작업)
3. 최종 연산 단계 -> 결과 도출 (반복 작업) forEach(), collect(), count(), sum()

*/

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        Stream<String> strStream = Stream.of("a", "b", "c");
        // new 하여 객체생성은 안된다
        // -> 주소값만 받아오기


//        strStream.forEach(s -> System.out.println(s)); // 단순히 출력만 하기
        /*
        * strStream.forEach(System.out::println);
        */

//        long c = strStream.count();
//        System.out.println(c);

//        System.out.println(strStream.collect(Collectors.toList()));
        // List로 변환

        strStream.forEach(System.out::println);
        strStream = Stream.of("a", "b", "c");
        strStream.forEach(System.out::println);



        // 스트림 객체 생성
        // 1. Stream 인터페이스의 static 메서드를 통해 생성하기
        Stream<String> stream = Stream.<String>builder()
                                        .add("a")
                                        .add("b")
                                        .add("c")
                                        .build();


        // 2. 배열 또는 컬렉션을 Stream으로 변환하여 생성하기
        Stream<String> stream2 = Stream.of("a", "b", "c");
        Stream<String> stream3 = Arrays.stream(new String[] {"a", "b", "c"});
        Stream<String> stream4 = List.of("a", "b", "c").stream();
        Stream<String> stream5 = Set.of("a", "b", "c").stream();
        Stream<String> stream6 = Map.of("a", "1", "b", "2", "c", "3").keySet().stream();
        Stream<String> stream7 = Map.of("a", "1", "b", "2", "c", "3").values().stream();
        Stream<Map.Entry<String, String>> stream8
                = Map.of("a", "1", "b", "2", "c", "3").entrySet().stream();

        List<String> names = List.of("김준일", "김준이");
        List<String> lastNames = new ArrayList<>();
            for (String name : names) {
                String lastName = name.substring(0 , 1);
                char lastName2 = name.charAt(0);
                lastNames.add(lastName);
            }
        lastNames.forEach(System.out::println);

            /// ///////////////////////////////

            Stream<String> nameStream1 = names.stream();
            Stream<String> nameStream2 = nameStream1.map(name -> name.substring(0, 1));
            Stream<String> nameStream3 = nameStream2.map(name -> " [ " + name + " ] ");

            List<String> names2 = nameStream3.collect(Collectors.toList());
            names2.forEach(System.out::println);


            /// ///////////////////////////////

             names.stream()
                .map(name -> name.substring(0, 1))
                .collect(Collectors.toList());

            names2.forEach(System.out::println);


            // 중간 연산 - map, filter
            // 1. map() 변환, 치환
            List<String> strNums = List.of("10", "20", "31");
            List<Integer> nums = StreamMap.map(strNums, strNum -> {
                int n = Integer.parseInt(strNum);
                if (n % 2 == 0) {
                    return n * 10;
                }
                return n;
            });

        }

    class StreamMap {
        public static <T, R> List<R> map(List<T> list, Function<T, R> action) {

            // null이 아닌 것이 필수적
            Objects.requireNonNull(list);
            Objects.requireNonNull(action);

//            if (Objects.isNull(list)) {
//                return null;
//            }
//
//            if (list.isEmpty()) {
//                return null;
//            }
//
            List<R> rList = new ArrayList<>();
            for (T t : list) {
                rList.add(action.apply(t));
            }
            return rList;
        }
    }
}
