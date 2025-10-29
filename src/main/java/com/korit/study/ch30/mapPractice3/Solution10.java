package com.korit.study.ch30.mapPractice3;

import java.util.Arrays;
import java.util.List;

/*
* 문제 10:
*
* 재고가 1개 이상 있고 (stock > 0), 할인 중인 (onSale = true) 상품만 필터링하기
*
* */

class Item {
    String name;
    int stock;
    boolean onSale;
    int price;

    public Item() {
    }

    public Item(String name, int stock, boolean onSale, int price) {
        this.name = name;
        this.stock = stock;
        this.onSale = onSale;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", stock=" + stock +
                ", onSale=" + onSale +
                ", price=" + price +
                '}';
    }
}


public class Solution10 {
    public static void main(String[] args) {

        List<Item> items = Arrays.asList(
                new Item("노트북", 5, true, 1000000),
                new Item("마우스", 0, true, 30000),
                new Item("키보드", 10, false, 50000),
                new Item("헤드셋", 3, true, 80000),
                new Item("웹캠", 0, false, 60000)
        );

        // 재고가 1개 이상 있고 (stock > 0), 할인 중인 (onSale = true) 상품만 필터링하기

        System.out.println("재고가 1개 이상 있고, 할인 중인 상품만 필터링하여 출력합니다");

        // 두 조건을 모두 만족하도록 코드를 짜야 함

        List<Item> filteringItems = items.stream()
                                    .filter(item -> item.getStock() >= 1 && item.isOnSale() == true)
                                    .toList();

        System.out.println(filteringItems);

    }
}
