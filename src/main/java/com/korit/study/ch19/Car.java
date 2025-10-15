package com.korit.study.ch19;

import java.util.Objects;

public class Car extends Object {
    // Car클래스의 멤버변수
    private String model;
    private String color;


    // Car클래스 생성자
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // 객체를 비교할 때 equals와 hashCode


    // equals
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car car)) return false; // Car 객체에서 생성된 것이 아니라면 false
        return Objects.equals(model, car.model) && Objects.equals(color, car.color);
        // 객체에서 나온 것이 맞다면 비교하여 결과값을 반환 처리
    }


    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }


    //toString
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}

