package com.korit.study.ch06;

/*

// 섭씨를 화씨로 변환하는 함수
public static double celsiusToFahrenheit(double celsius) {
    return celsius * 9 / 5 + 32;
}

// 화씨를 섭씨로 변환하는 함수
public static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
}

// 섭씨 온도를 받아서 화씨로 변환한 후, 다시 섭씨로 변환하여
// 원래 값이 맞는지 확인하는 함수를 작성하세요
public static void checkTemperatureConversion(double celsius) {
    // 여기에 중첩 함수 호출 코드 작성
}

*/


public class 중첩함수연습문제1 {
    public static void main(String[] args) {
        checkTemperatureConversion(38.5);
    }


    // 섭씨를 화씨로 변환하는 함수
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    // 화씨를 섭씨로 변환하는 함수
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // 섭씨 온도를 받아서 화씨로 변환한 후, 다시 섭씨로 변환하기
    // 원래 값이 맞는지 확인하는 함수를 작성하세요
    public static void checkTemperatureConversion(double celsius) {
//            celsiusToFahrenheit(celsius);
//            fahrenheitToCelsius(celsius * 9 /5 + 32);

        System.out.println((double)(fahrenheitToCelsius(celsiusToFahrenheit(celsius))));
    }

}
