package com.korit.study.ch22.service;


import com.korit.study.ch22.entity.User;
import com.korit.study.ch22.repository.UserRepository;

import java.util.Objects;

public class SignupService {
    // 1. instance static 변수 정의
    private static SignupService instance;
    private UserRepository userRepository;


    // SignupService의 생성자 생성하는데 매개변수를 UserRepository로 받음
    private SignupService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // getter
    public static SignupService getInstance() {
        if (Objects.isNull(instance)) {
            // instance 없으면 새로운 객체 생성하여 instance 주입하기
            instance = new SignupService(UserRepository.getInstance());
        }
        return instance;
    }

    // validDuplicatedUsername 사용하여 Username 검사하기
    public boolean isValidDuplicatedUsername(String username) {
        User foundUser = userRepository.findByUsername(username);
        // 중복되지 않음  -> 유효함
        if (Objects.isNull(foundUser)) {
            return true;
        }
        return false;
    }

    public boolean isValidPassword(String password) {
        // isEmpty.trim = isBlank

        // password가 null이 아니어야 하고 공백제거하였을 때 blank도 아니어야 한다
        return !Objects.isNull(password) && !password.isBlank();
    }

    public boolean isValidConfirmPassword(String password, String confirmPassword) {
        if (Objects.isNull(password) || Objects.isNull(confirmPassword)) {
            return false;
        }
        return password.equals(confirmPassword);
    }
}
