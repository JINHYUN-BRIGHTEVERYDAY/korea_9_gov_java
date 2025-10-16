package com.korit.study.ch19;

import java.util.Objects;

// public class Car extends Object
public class Car {
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
//    @Override
//    public boolean equals(Object o) {
//
//        if (!(o instanceof Car)) {
//            return false;
//        }
//        // Object는 모두 다 받을 수 있음 그러므로 매개변수에 다 넣을 수 있음
//        // 어떤 값을 받아야할지 모를 때, 어떤 자료형이라도 다 받을 수 있어야 할 때
//        // Car 객체에서 생성된 것이 아니라면 false
//
//        Car car = (Car) o;
//        // if (!(o instanceof Car)) return false;
////        if (Objects.isNull(car)) {
////
////        }
//        return Objects.equals(model, car.model) && Objects.equals(color, car.color);
//        // 객체에서 나온 것이 맞다면 비교하여 결과값을 반환 처리
//        // Objects는 생성한적이 없음 -> util, 다시 말해서 static으로 사용

@Override
public boolean equals(Object o) {

    if (!(o.getClass() != Car.class)) {
        return false;
    }
    Car car = (Car) o;

    return Objects.equals(model, car.model) && Objects.equals(color, car.color);



        /*

        Object


        Object 클래스는 Java의 모든 클래스의
        기본 클래스를 말합니다.



        Objects


        Objects 클래스는 Java 7에서 추가된 유틸리티 클래스입니다.
        Objects 클래스는 null-safe한 메서드들을 제공하여,
        객체 비교, null 처리 등에 편리하게 사용할 수 있도록 합니다.
        Objects 클래스에서 제공하는 메서드에는
        requireNonNull(), equals(), hash(), toString() 등이 있습니다.



        결론


        즉, Object는 자바의 모든 클래스가 상속하는 부모 클래스를 말하고 Objects는
        단순히 null 처리 혹은 비교와 같은 유틸리티성 기능을 제공하는 클래스를 말합니다.

        * */

    }


    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }

    // ---------------------------------------------------------------

    //toString
    //객체 안에 어떤 값이 들어있는지 확인하는 용도
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

