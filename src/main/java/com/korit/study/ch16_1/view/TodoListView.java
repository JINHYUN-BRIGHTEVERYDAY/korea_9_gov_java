package com.korit.study.ch16_1.view;

import com.korit.study.ch16_1.dto.TodoRegisterDto;
import com.korit.study.ch16_1.dto.SigninDto;
import com.korit.study.ch16_1.entity.User;
import com.korit.study.ch16_1.service.TodoService;
import com.korit.study.ch16_1.service.UserService;

import java.util.Scanner;

public class TodoListView {
    //멤버변수로 View단에서 보여줄 것을 받기
    private Scanner Scanner;
    private User principal;
    private UserService userService;
    private TodoService todoService;


    Scanner scanner =new Scanner(System.in);
    // 생성자
    public TodoListView(UserService userService, TodoService todoService) {
        Scanner = new Scanner(System.in);
//        this.principal = principal;
        this.userService = userService;
        this.todoService = todoService;
    }

    // 메인 화면에서 구동할 메서드
    public void homeView() {
        // true일 때 무한 반복을 돌려야함
        while(true) {
            System.out.println(" [TodoList] ");
            System.out.println(" 1. TodoList ");
            // 사용자 정보가 하나도 없는 상황을 가정
            if (principal == null) {
                System.out.println("2. 회원가입");
                System.out.println("3. 로그인");
                // 사용자 정보가 있는 상황을 가정
            } else {
                System.out.println("2. 로그아웃");
            }
            System.out.println("q. 프로그램 종료");
            System.out.print(" >> ");
            String cmd = scanner.nextLine();

            if ("q".equals(cmd)) {
                break;
            } else if ("1".equals(cmd)) {
                if (principal == null) {
                    System.out.println("로그인 후 사용가능합니다.");
                    continue;
                }
                // 입력값이 null이 아니므로, 로그인이 정상 되었다고 간주
                // 그러므로 View 리스트 화면을 보여준다
                todoListMenuView();
                System.out.println();
             } else if ("2".equals(cmd) && principal == null) {
                // 2번을 눌렀는데 회원의 정보가 없는 상황 -> 회원가입시키기
                // 회원가입 화면으로 이동
                signupView();
            } else if ("2".equals(cmd) && principal != null) {
                principal = null;
                // 2번을 눌렀는데 회원의 정보가 존재하는 상황 -> 로그아웃시키기
                // 로그아웃 화면으로 이동
                System.out.println("==<< 로그아웃 완료! >>==");
            } else if ("3".equals(cmd) && principal == null) {
                // 로그인
                signinView();
            }
        }
    }


    void signinView() {
        System.out.println("[ 로그인 ]");
        System.out.println("username >> ");
        String username = scanner.nextLine();
        System.out.println("password >> ");
        String password = scanner.nextLine();
        SigninDto signinDto = new SigninDto(username, password);
        User foundUser = userService.signin(signinDto);
        if (foundUser == null) {
            System.out.println("사용자 정보를 다시 확인하세요");
            return;
        }
        principal = foundUser;
        System.out.println("==<< 로그인 성공!! >>== ");
    }

    void signupView() {
        System.out.println("[ 회원 가입 ]");
        String username = null;
        while(true) {
            System.out.println("username >> ");
            username = scanner.nextLine();
            // ??
            // 이름이 중복된지를 검사하기 -> 그게 중복된 것이 없다면
            if (!userService.isDuplicatedUsername(username)) {
                break; // while문 빠져나와도 되고 다음 입력칸으로 바로 이동
            }
            System.out.println("이미 존재하는 사용자 이름입니다.");
            // 이미 존재하는 사용자 이름이므로 다시 입력을 시켜야 함
            // while문 다시 반복돌림
        }
        // username은 입력이 끝났으므로 나머지 password와 name을 입력받도록 함
        System.out.println("password >> ");
        String password = scanner.nextLine();
        System.out.println("name >> ");
        String name = scanner.nextLine();


        // SigninDto 객체 만들어서 보관하기
        SigninDto signinDto = new SigninDto(username, password);

        // 보관된 SigninDto를 toString 형태로 출력하기
        System.out.println(signinDto.toString());

        // 회원가입 처리하기
        userService.signin(signinDto);
        System.out.println("==<< 회원가입 완료!! >>==");

        // 결과 printUserListAll 형태로 보여주기
        userService.printUserListAll();
    }

    void todoListMenuView() {
        while(true) {
            System.out.println("[ TodoList Menu ]");
            System.out.println("1. Todo 등록");
            System.out.println("2. Todo 조회");
            System.out.println("b. 뒤로 가기");
            System.out.println(" >> ");
            String cmd = scanner.nextLine();

            if("b".equals(cmd)) {
                break;
            } else if ("1".equals(cmd)) {
                System.out.println("[ Todo 등록 ]");
                System.out.println(" 오늘 할 일 >> ");
                String contents = scanner.nextLine();
                TodoRegisterDto todoRegisterDto = new TodoRegisterDto(contents, principal);
                todoService.register(todoRegisterDto);
                System.out.println("===<< Todo 등록 완료 >>===");
            } else if ("2".equals(cmd)) {
                System.out.println("[ Todo 조회 ]");
                todoService.printAllByUser(principal);
            }
        }
    }
}
