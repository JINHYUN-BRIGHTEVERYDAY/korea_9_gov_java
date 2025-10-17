package com.korit.study.ch22.service;

import com.korit.study.ch22.dto.SigninDto;
import com.korit.study.ch22.entity.User;
import com.korit.study.ch22.repository.UserRepository;

import java.util.Objects;

public class SigninServiceImpl implements SigninService{


    // 싱글톤으로 만들 것

    // ★ instance static 변수를 정의하였음
    private static SigninService instance;

    private UserRepository userRepository;

    private SigninDto signinDto;

    // ★ SignupServiceImpl 생성자를 생성하는데에 매개변수를 UserRepository로 받음
    public SigninServiceImpl(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    // getter로 Instance 받기
    public static SigninService getInstance() {
        if (Objects.isNull(instance)) {
            instance = new SigninServiceImpl(UserRepository.getInstance());
        }
        return instance;
    }

    // 인터페이스에서 작성한 메서드 구현하기
    @Override
    public void signin(SigninDto signinDto) {
        // ★ 로그인을 시도한 사용자의 이름을 확인하기 -> userRepository에서 -> 완료
        // ★ 해당 사용자 이름을 가진 User 객체가 있는지 확인하기
        // ★ 객체가 null 이면 함수 탈출하기 (사용자 정보를 확인하세요)


        // 사용자의 이름이 있는지 확인하기

//        public boolean isValidDuplicatedLoginUsername(String username) {
//            User foundConfirmUser = userRepository.findByUsername(signinDto.getUsername());
//
//        }


        User confirmUser = userRepository.findByUsername(signinDto.getUsername());
            if (!Objects.isNull(confirmUser)) {
                signinDto.equals(confirmUser);
            }
        System.out.println("사용자 정보를 다시 확인하세요");




        // 비밀번호 일치하는지 확인하기
        User confirmPassword = userRepository.findByUsername(signinDto.getPassword());
        if (!Objects.isNull(confirmPassword)) {
            signinDto.equals(confirmPassword);
        }
        // 비밀번호가 일치하지 않으면 함수를 탈출하기 (사용자 정보를 다시 확인하세요)
        System.out.println("사용자 정보를 다시 확인하세요");


        // 로그인 성공 -> 로그인 성공한 User 객체 toString으로 출력하기
        System.out.println("로그인 성공하였습니다.");

        confirmUser.toString();
        confirmPassword.toString();

    }

    @Override
    public boolean isEmpty(String str) {
        // username, password가 각각 공백이 아닌지 확인하기 위한 용도로 사용
        return false;
    }

}
