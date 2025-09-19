package com.korit.study.ch01;

import java.util.Date;

/*
*
* */
public class Type {
    /*
    *
    * @param args
    * */

    public static void main(String[] args) {

//        논리 자료형

//         변수 선언, 초기화
        /*
        boolean open; -> 선언만 하고 초기화 안함
        open = true;
        System.out.println(open);

        boolean open; -> 선언만 하고 초기화 안함
        System.out.println(open); -> 컴파일 오류

        boolean open = true; -> 선언과 초기화 완료
        System.out.println(open); -> 정상출력


        * */

        /*
        *
        *
        *
        * */

        boolean open = true;
        System.out.println(open);

        open = false;
        System.out.println(open);

//        문자 자료형
        char lastName = '김'; // 문자열이 아닌 문자, 한 글자만 담기 가능
        System.out.println(lastName);
//        char firstName = '준일'; //한 글자가 아니기 때문에 오류 발생

//        문자열 자료형
        String firstName = "준일";
        System.out.println(firstName);
        String contents1 = "안녕하세요.\n김준일입니다."; // 여러 줄을 출력할 경우
        System.out.println(contents1);
        String contents2 = """
                안녕하세요.
                김준일입니다."""; // \n 쓰지 않고 줄바꿈하기
        System.out.println(contents2);

        double avg = 89.33;
        System.out.println(avg);

//        숫자
        int number = 10000000;
        System.out.println(number);

//      long nowTime = (int) new Date().getTime();
        long nowTime = (int) new Date().getTime(); // 현재 시간 조회하기

//        int nowTime = (int) new Date().getTime();
        // 명시적 형변환 (int)
        System.out.println(nowTime);

        long longNumber = 2200000000l;
        System.out.println(longNumber);

//        상수

        final String uploadPath = "~/upload/image"; // 파일 경로
        final String UPLOAD_PATH = "~/upload/image"; // 상수의 변수명은 대문자로 쓰자
        // 선언은 한 번만, 두 번 하는 거 아님

//        UPLOAD_PATH = "";
//        앞에서 상수 선언이 되었기 때문에 오류 발생
        // 한번 대입되고 재대입되지 않는 변수가 있음 그런 경우에 상수를 사용
        // 예를 들어서 스프링부트의 개인정보같은 것 -> 데이터가 변하지 않게 보호
        // 변할 수 있는 경우 상수를 사용해서는 안된다

    }
}

