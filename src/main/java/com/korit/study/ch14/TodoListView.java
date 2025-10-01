package com.korit.study.ch14;

import java.util.Scanner;

public class TodoListView {

    Scanner scanner;
    User principal;
    UserService userService;


    /*
    * 클래스 정의할 때 생성이 될 것
    * 생성자로 호출되면 그때 만들 것
    * */

    TodoListView(UserService userService) {
        scanner = new Scanner(System.in);
        this.userService = userService;
    }


    // 홈 화면에 대한 메서드
    void homeView() {
        // 반복하기 위해서 while문으로 사용
        while (true) {
            System.out.println("[ TodoList ]");
            System.out.println("1. TodoList");
            if (principal == null) {
                System.out.println("2. 회원가입");
                System.out.println("3. 로그인");
            } else {
                System.out.println("4. 로그아웃");
            }
            System.out.println("q. 프로그램 종료");
            System.out.print(" >> ");
            String cmd = scanner.nextLine();


            if ("q".equals(cmd)) {
                break;
            } else if("1".equals(cmd)) {
                if (principal == null) {
                    System.out.println("로그인 후 사용가능합니다");
                    continue;
                }
            } else if("2".equals(cmd) && principal == null) {
                // 회원가입
                signupView();
            } else if("2".equals(cmd) && principal != null) {
                // 로그아웃
            } else if("3".equals(cmd) && principal == null) {
                // 로그인
                signinView();
            }
        }
    }


//    SignupDto signupDto = new SignupDto(username, password, name);

    // 로그인에 대한 메서드
    void signinView() {
        System.out.println("[로그인]");
        System.out.println("username >>");
        String username = scanner.nextLine();
        System.out.println("password >>");
        String password = scanner.nextLine();
        SigninDto signinDto = new SigninDto(username, password);
        User foundUser = userService.signin(signinDto);
        if (foundUser == null) {
            System.out.println("사용자 정보를 다시 확인하세요");
        }

        principal = foundUser;
        System.out.println("== << 로그인 성공!! >> ==");
    }


    // 회원가입에 대한 메서드
    void signupView() {
        System.out.println("[ 회원가입 ]");
        String username = null;
        while(true) {
            System.out.print("username >> ");
            username = scanner.nextLine();
            // !userService.isduplicatedUsername(username) => 중복이 아니라면의 의미
            if (!userService.isduplicatedUsername(username)) {
                break; //중복이 아니라면 브레이크 걸어서 조건문을 빠져나오고 다음 패스워드 입력하는로직으로 이동
            }
            System.out.println("이미 존재하는 사용자의 이름입니다. 확인해주세요");
            }
            System.out.print("password >> ");
            String password = scanner.nextLine();
            System.out.print("name >> ");
            String name = scanner.nextLine();
            SignupDto signupDto = new SignupDto(username, password, name);
            System.out.println(signupDto.toString());
            userService.signup(signupDto);
            System.out.println("==<< 회원가입 완료!! >>==");
            userService.printUserListAll();

    }

}
