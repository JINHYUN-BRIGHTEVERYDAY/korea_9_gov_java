package com.korit.study.cho8;

//import java.util.Scanner;

public class Array02 {
    // 객체의 연장선
    public static void main(String[] args) {
        String[] 사원ID = new String[] {"E1001", "E1002", "E1003", "E1004"};
        String[] 이름 = new String[] {"김민준", "이서연", "박지훈", "최예나"};
        String[] 부서 = new String[] {"영업팀", "마케팅팀", "개발팀", "인사팀"};
        String[] 직급 = new String[] {"사원", "대리", "과장", "차장"};

        String name = "이서연";

        int foundIndex = -1;

        // 탐색 알고리즘
        // 2번 인덱스가 대입되게끔 출력하도록 for문 사용

//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();

        for (int i = 0; i < 이름.length; i++) {
            if(이름[i] == name) {
                foundIndex = i;
                break; // 선형탐색의 경우 반드시 break를 걸어놓기
            }
//            System.out.println(이름[i]);

//            lastOfIndex...


        }
        printInfo(사원ID, 이름, 부서, 직급, foundIndex);







//        System.out.println("이름을 입력합니다: ");
//        String[] 새로운이름 = new String[이름.length + 1] ;
//        for (int i = 0; i < 이름.length; i++) {
//            새로운이름[i] = 이름[i];
//        }
//
//        새로운이름[새로운이름.length - 1] = scanner.nextLine();
//        이름 = 새로운이름;
//




    }

    public static void printInfo(
            String[] 사원ID,
            String[] 이름,
            String[] 부서,
            String[] 직급,
            int index) {
        System.out.printf("""
                사원ID: %s
                이름: %s
                부서: %s
                직급: %s
                """,
                사원ID[index],
                이름[index],
                부서[index],
                직급[index]);



//        String text = String.format("""
//                사원ID: %s
//                이름: %s
//                부서: %s
//                직급: %s
//                """,
//                사원ID[index],
//                이름[index],
//                부서[index],
//                직급[index]);

//        System.out.println(text);

        // String.format과 printf의 차이 구별
        // System.out.print(String.format());
        // System.out.printf();
    }

}
