package com.korit.study.ch29;

import javax.swing.*;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface {
    public static void main(String[] args) {

        // 1. 매개변수 X, 리턴 X
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable 인터페이스");
            }
        };


        // 람다 표현식
        Runnable runnable2 = () -> {
            System.out.println("runnable 인터페이스");
        };
        runnable.run();


        // 2. 매개변수 O, 리턴 X
        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Consumer 인터페이스");
                System.out.println("매개변수 s: " + s);
            }
        };
        stringConsumer.accept("consumer");




        Consumer<String> stringConsumer2 = s -> {
            System.out.println("consumer 인터페이스");
            System.out.println("매개변수 s: " + s);
        };
        stringConsumer2.accept("consumer2");




        Consumer<Integer> andThenStudy = num -> {
            System.out.println("1");
            System.out.println(num);
        };




        Consumer<Integer> andThenStudy2 = andThenStudy.andThen(num2 -> {
            System.out.println("2");
            System.out.println(num2);
        });



        andThenStudy.accept(10);
        andThenStudy2.accept(20);




        Consumer<Double> doubleConsumer = d -> {
            System.out.println("1");
            System.out.println("숫자 : " + d);
        };
        doubleConsumer.andThen(d -> {
            System.out.println("2");
            System.out.println("숫자 : " + d);
        }).andThen(d -> {
            System.out.println("3");
            System.out.println("숫자 : " + d);
        }).andThen(d -> {
            System.out.println("4");
            System.out.println("숫자 : " + d);
        }).accept(3.14);


        // 3. 매개변수 X, 리턴 O
        String str = null;
        Supplier<Boolean> booleanSupplier = () -> Objects.isNull(str);

        System.out.println(booleanSupplier.get());


        // 4. 매개변수 O, 리턴 O
        Function<Integer, String> function = num -> {
            System.out.println("정수 받아서 문자열 정수로 리턴");
            return Integer.toString(num);
        };


        String functionResult = function.apply(10);
        System.out.println(functionResult);


        Integer functionResult2 = function
                .andThen(s -> {
                    System.out.println("문자열 정수 받아서 실수 자료형으로 리턴");
                    return Double.parseDouble(s);
                }).andThen(d -> {
                    System.out.println("실수자료형 받아서 정수로 리턴");
                    return d.intValue();
                }).apply(20);

        System.out.println(functionResult2);


        String functionResult3 = function
                .compose(d -> {
                    System.out.println("실수자료형을 정수로 리턴");
                    return ((Double) d).intValue();
                })
                .apply(20.5);

        System.out.println(functionResult3);



        // 4. 매개변수 O, 리턴 Boolean
        String searchUsername = "test1234";
        Predicate<List<Map<String, String>>> listPredicate =  list -> {
            AtomicBoolean isFound = new AtomicBoolean(false);
            list.forEach(map -> {
               if (map.get("username").equals(searchUsername)) {
                   isFound.set(true);
               }
           });
            return isFound.get();
        };

        List<Map<String, String>> userList = List.of(
                Map.of("username", "test1", "password", "1111"),
                Map.of("username", "test1", "password", "2222"),
                Map.of("username", "test1", "password", "3333"),
                Map.of("username", "test1", "password", "4444")
        );

        System.out.println(listPredicate.test(userList));


    }
}
