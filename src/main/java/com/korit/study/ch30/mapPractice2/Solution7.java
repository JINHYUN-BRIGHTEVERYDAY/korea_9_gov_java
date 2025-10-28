package com.korit.study.ch30.mapPractice2;

/*
* 7. 상품명과 가격 결합
* 각 Item을 "상품명(가격원)" 형식의 문자열로 변환하시오
* */

import java.util.Arrays;
import java.util.List;


class Item {
    String name;
    int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Item() {
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}

public class Solution7 {
    public static void main(String[] args) {
//        I
        List<Item> items = Arrays.asList(
                new Item("사과", 3000),
                new Item("바나나", 2000),
                new Item("오렌지", 5000)
        );

//        List<String> formattedStrings = items.stream()
//                .map(username -> String.format("%s(%d원)", items.get(0), items.get(1), items.get(2));
//
//        formattedStrings.forEach(System.out::println);


    }

}
