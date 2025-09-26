package com.korit.study.ch06;

// 메서드
public class Function2 {
    public static void main(String[] args) {
        fx1();
//        fx1(); 만약 기능이 두 번 출력된다면 이렇게 두 번 쓰기
        fx2("JINHYUN", 30);
        fx3("JINHYUN2", 30);
        int[] arr1 = fx4(); //fx(4) 메서드의 자료형이 int배열형태
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }
        printIntArray(arr1);

        int[] arr2 = fx5(5);
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);
//        }
        printIntArray(arr2);

    }




    static void fx1() {
        int num1 = 10;
        int num2 = 20;
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result += num1;
            result += num2;
        }
        System.out.println(result);
    }


    // 메서드의 이름이 같으면 호출할 때 오류가 발생한다
    static void fx2(String name, int age) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }

    static void fx3(String a, int b) {
        System.out.println("이름: " + a);
        System.out.println("나이: " + b);
    }

    static int[] fx4() {
        int[] result = new int[0]; // result가 비어있는 배열
        int size = 10;
        for (int i = 0; i < size; i++) { //반복 10번
            int[] temp = new int[result.length + 1]; //temp를 반복 돌때마다 새로 만드는데 result보다 하나 더 큰 사이즈로
            for (int j = 0; j < result.length; j++) {
                temp[j] = result[j]; //temp에 result 값 다 넣고
            }
            temp[temp.length - 1] = i + 1; //새로 만든 temp에다가 인덱스 집어넣기
            result = temp; // 그러면 새로운 temp라는 배열이 생성될 것
        }
        return result;
    }


    static int[] fx5(int size) {
        int[] result = new int[0]; // result가 비어있는 배열

        // int size가 비어있는데 매개변수에 size를 받도록 되어있다

//        int size = 10;
        for (int i = 0; i < size; i++) { //반복 10번
            int[] temp = new int[result.length + 1]; //temp를 반복 돌때마다 새로 만드는데 result보다 하나 더 큰 사이즈로
            for (int j = 0; j < result.length; j++) {
                temp[j] = result[j]; //temp에 result 값 다 넣고
            }
            temp[temp.length - 1] = i + 1; //새로 만든 temp에다가 인덱스 집어넣기
            result = temp; // 그러면 새로운 temp라는 배열이 생성될 것
        }
        return result;
    }

    static void printIntArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }




}
