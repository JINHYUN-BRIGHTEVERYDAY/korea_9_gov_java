package com.korit.study.ch05;

public class solution4 {
    public static void main(String[] args) {
        /*
        * 문제 4: 배열의 짝수만 출력하기
        * 정수형 배열 {1,2,3,4,5,6,7,8,9,10}에서
        * 짝수만 출력하는 프로그램 작성하기
        * */

        int numbers[] = new int[] {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;
        System.out.print("짝수: ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + ",");
            }
        }



//        복습하기
//        int numbers[] = new int[] {1,2,3,4,5,6,7,8,9,10};
//        int sum = 0;
        int[] evens = new int[0]; //짝수만 담은 배열 출력


        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) { //짝수를 찾아내는 조건
                int even = numbers[i];
//                System.out.println(even);

//                evens = new int[evens.length + 1];
                int[] temp = new int[evens.length + 1];
                for (int j = 0; j < evens.length; j++) {
                    temp[j] = evens[j];
                }

//                temp[temp.length -1 ] = numbers[i];

                evens[evens.length -1] = numbers[i];
                evens = temp;
            }
        }

    }
}
