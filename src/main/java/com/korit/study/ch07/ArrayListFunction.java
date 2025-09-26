package com.korit.study.ch07;

import java.util.Scanner;

public class ArrayListFunction {

    public static void printNameAll(String[] names) {

        if(names.length == 0) {
            System.out.println("등록된 이름이 없습니다.");
        } else {
            for (int i = 0; i < names.length; i++) {
                System.out.println("이름(" + i + "): " + names[i]);
            }
        }
    }

    public static String[] addToArray(String value, String[] currentArray) {
        String[] newArray = new String[currentArray.length + 1];
        // 새로운 배열이 생겼음

        //  반복하면서 인덱스 이동해주어야
        for (int i = 0; i < currentArray.length; i++) {
            newArray[i] = currentArray[i];
        }
        newArray[newArray.length - 1] = value;
        return newArray;
    }

    public static String inputName() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름입력: ");
        return scanner.nextLine();
    }

    public static String[] addInputNameToNames(String[] names) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("이름입력: ");
//        String name = scanner.nextLine();

         String name = inputName();

        return addToArray(name, names);

        //        String[] newNames = new String[names.length + 1];
//        // 새로운 배열이 생겼음
//
//        //  반복하면서 인덱스 이동해주어야
//        for (int i = 0; i < names.length; i++) {
//            newNames[i] = names[i];
//        }
//
//        newNames[newNames.length - 1] = name;
//        return newNames;
    }

    public static void main(String[] args) {
        String[] names = new String[0];

        printNameAll(names);
        names = addInputNameToNames(names);
        printNameAll(names);
        names = addInputNameToNames(names);
        printNameAll(names);
        names = addInputNameToNames(names);
        printNameAll(names);
        names = addInputNameToNames(names);
        printNameAll(names);


    }
}


//        System.out.print("1번 이름입력: ");
//        String name1 = scanner.nextLine();
//        String[] newNames = new String[names.length + 1];
//        newNames[newNames.length - 1] = name1;
//        names = newNames;
//
//        printNameAll(names);
//
//
//
//
//
//
//        System.out.print("3번 이름입력: ");
//        String name3 = scanner.nextLine();
//        String[] newNames3 = new String[names.length + 1];
//        // 새로운 배열이 생겼음
//
//        //  반복하면서 인덱스 이동해주어야
//        for (int i = 0; i < names.length; i++) {
//            newNames3[i] = names[i];
//        }
//
//        newNames3[newNames3.length - 1] = name3;
//        names = newNames3;


