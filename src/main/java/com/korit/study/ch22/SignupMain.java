package com.korit.study.ch22;

import com.korit.study.ch22.dto.SignupDto;
import com.korit.study.ch22.service.SignupService;

import java.util.Scanner;

public class SignupMain {
    public static void main(String[] args) {

//        String prevPassword = "test1234";
//        String currentPassword = "test1234";
//        long prevPasswordHashcode = Integer.toUnsignedLong(Objects.hash(prevPassword));
//        long currentPasswordHashcode = Integer.toUnsignedLong(Objects.hash(currentPassword));
//        long encodedPassword = prevPasswordHashcode * 10l;
//        System.out.println(prevPasswordHashcode);
//        System.out.println(currentPasswordHashcode);
//        System.out.println(encodedPassword);
//        System.out.println(encodedPassword / 10l);

        // static
        SignupService signupService = SignupService.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("[회원가입, 로그인]");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 가입된 회원 전체 조회하기");
            System.out.println("q. 종료");
            System.out.println("선택 >> ");
            String selectedMenu = scanner.nextLine();

            if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램 종료 중 ...");
                break;
            } else if ("1".equalsIgnoreCase(selectedMenu)) {
                System.out.println("[ 회원가입 ]");
                SignupDto signupDto = new SignupDto();
                while(true) {
                    System.out.print("사용자이름 : ");
                    signupDto.setUsername(scanner.nextLine()); // 이름 설정
                    if (signupService.isValidDuplicatedUsername(signupDto.getUsername())) { // 이름 꺼내오기 getter 이용
                        break; // 중복되지 않았으므로 사용 가능 -> 반복 끝
                    }
                    System.out.println("이미 사용중인 사용자이름입니다.");
                }

                // 비밀번호 입력
                while(true) {
                    System.out.print("비밀번호 : ");
                    signupDto.setPassword(scanner.nextLine());
                    if (signupService.isValidPassword(signupDto.getPassword())) {
                        break;
                    }
                    System.out.println("비밀번호는 공백일 수 없습니다. 비밀번호를 다시 입력해주세요");
                }

                // 비밀번호 확인
                while(true) {
                    System.out.print("비밀번호확인: ");
                    signupDto.setConfirmPassword(scanner.nextLine());
                    if (signupService.isValidConfirmPassword(signupDto.getPassword(), signupDto.getConfirmPassword())) {
                        break;
                    }
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요");
                }


            } else if ("2".equalsIgnoreCase(selectedMenu)) {
                System.out.println("[ 로그인 ]");
                System.out.print("사용자이름 : ");
                System.out.print("비밀번호 : ");

            } else if ("3".equalsIgnoreCase(selectedMenu)) {
                System.out.println("[ 가입된 회원 전체 조회하기 ]");
            }
        }
        System.out.println("프로그램 종료 완료");
    }
}
