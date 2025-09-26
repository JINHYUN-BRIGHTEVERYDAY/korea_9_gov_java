package com.korit.study.ch07;

import java.util.Scanner;

public class ArrayListFunction2 {

    public static int[] inputNums() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[0];

        for (int i = 0; i < 6; i++) {
            while(true) {
                System.out.println((i + 1) + "번 숫자 입력: ");
                int inputValue = scanner.nextInt();
                if (inputValue > 0 && inputValue < 46) {
                   boolean isFind = false;

                    for(int j = 0; j < nums.length; j++) {
                        if(nums[j] == inputValue) {
                            isFind = true;
                            break;
                        }
                    }

                    if (isFind) {
                        System.out.println("중복된 번호입니다.");
                        continue;
                    }

                    else {
                        int[] newNums = new int[nums.length + 1];
                        for (int j = 0; j < nums.length; j++) {
                            newNums[j] = nums[j];
                        }
                        newNums[newNums.length - 1] = inputValue;
                        nums = newNums;
                        break;
                    }

                }
                System.out.println("숫자는 1에서 45까지 입력이 가능합니다");
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        /*
        * 복권번호 6자리 입력하기
        * */
        // 0번째 복권 번호 입력하기
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[0];

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.print("숫자 입력: ");
        int[] newNums = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
        }
        newNums[newNums.length - 1] = scanner.nextInt();
        nums = newNums;


        System.out.print("숫자 입력: ");
        newNums = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
        }
        newNums[newNums.length - 1] = scanner.nextInt();
        nums = newNums;



        System.out.print("숫자 입력: ");
        newNums = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
        }
        newNums[newNums.length - 1] = scanner.nextInt();
        nums = newNums;


        System.out.print("숫자 입력: ");
        newNums = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
        }
        newNums[newNums.length - 1] = scanner.nextInt();
        nums = newNums;


        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }


//        String[] number = new String[0];



    }
}
