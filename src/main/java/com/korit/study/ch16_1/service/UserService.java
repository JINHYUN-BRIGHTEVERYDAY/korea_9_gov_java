package com.korit.study.ch16_1.service;

import com.korit.study.ch16_1.dto.SigninDto;
import com.korit.study.ch16_1.dto.SignupDto;
import com.korit.study.ch16_1.entity.User;
import com.korit.study.ch16_1.repository.UserList;

// Service단이므로 Repository에 접근이 가능해야 함
public class UserService {

    // Repository 에서 생성한 UserList 객체 사용해야 함
    public UserList userList;


    // 생성자
    public UserService(UserList userList) {
        this.userList = userList;
    }


    // 가입된 username이 중복인지 확인하기 -> ★
    public boolean isDuplicatedUsername(String username) {

        return userList.findByUsername(username) != null;
    }


    // 로그인하기
    public User signin(SigninDto signinDto) {
        /*
        * foundUser : 조회하고자 하는 사용자
        * userList에서 findByUsername으로 사용자를 조회하는데
        * signinDto에서 username을 받아서 조회하여 일치하는지 확인하기
        *
        * foundUser에 입력한 것이 전혀 없고 공란이면 -> null 반환
        *
        * foundUser에 입력한 비밀번호가 signinDto에 등록된 password와 일치하지 않으면
        * null 반환
        *
        * 그리고 foundUser 반환
        * */

        // User찾기, user에 가입된 List에서 findByUsername을 이용하여 찾기
        User foundUser = userList.findByUsername(signinDto.getUsername());
        if (foundUser == null) {
            // 사용자의 이름 (아이디)가 존재하지 않는다
            return null; // null 반환
        }
        if (!foundUser.getPassword().equals(signinDto.getPassword())) {
            return null; // 사용자의 비밀번호가 등록된 것과 일치하지 않는다면 null 반환
        }
        return foundUser;
        // 모두 일치하는 경우 foundUser을 그제서야 반환하기
    }



//     회원가입
    public void signup(SignupDto signupDto) {
        User user = signupDto.toUser(); // signupDto에서 받은 정보를 User로 전환하기


        // 이제 Id를 확정지어 넣기 -> setId
        // userList에 UserId를 등록하기  -> userList.generateUserId
        user.setId(userList.generatedUserId());

    }



//    모든 회원 출력하기
    public void printUserListAll() {
        System.out.println("등록된 사용자 전체 조회하기");

        // 향상된 for문으로
        for (User user : userList.findAll()) {


            // toString 형태로 출력하기
            System.out.println(user.toString());
        }
    }
}
