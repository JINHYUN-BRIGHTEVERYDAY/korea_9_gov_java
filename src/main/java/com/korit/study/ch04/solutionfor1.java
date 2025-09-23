package com.korit.study.ch04;

public class solutionfor1 {
    public static void main(String[] args) {

        // 2부터 100까지의 숫자 중에서
        // 2< i < 100 까지의 숫자 중에서 4의 배수를 출력하라
//        for (int i = 3; i < 100; i++) {
//            if (i % 4 == 0) {
//                System.out.println(i);
//            }
//        }

        // i가 20번 반복할 것 -> 횟수
        // 0부터 시작하여, 어떤 i가 홀수인지, 짝수인지?
        for (int i = 0; i <= 20; i++) {
            if (i == 0) {
                // 0일 때는 출력하지 않도록
            } else if (i % 2 == 0) {
                System.out.println(i + " => 짝수");
            } else {
                System.out.println(i + " => 홀수");
            }
        }



        // 준일쌤 풀이
        for (int i = 0; i < 20; i++) {
            int n = i + 1;

            System.out.printf("%,d=%s\n", n, n % 2 == 0 ? "짝" : "홀");

            if (n % 2 == 0) {
                System.out.println(n + " = 짝");

            } else {
                System.out.println(n + " = 홀");
            }

            if (n % 2 == 0) {
                System.out.println(n + " = 짝");
                continue;

                // 아래에 코드가 실행되지 않는지 확인하여 continue 작성해야 한다

            }
            System.out.println(n + " = 홀");

        }
    }


}
