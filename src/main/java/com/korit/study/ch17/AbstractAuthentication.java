package com.korit.study.ch17;

// 추상클래스
public abstract class AbstractAuthentication implements UserDetails {
    private User user; //멤버변수

    public AbstractAuthentication(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    // 메서드
    public void auth() {
        System.out.println("인증을 합니다.");
    }


    // 추상메서드
//    public abstract void checkAuthority(User user);

    public abstract void checkAuthority();


    // UserDetails에서의 추상메서드
//    @Override
//    public String getUsername() {
//        return "";
//    }
//
//    @Override
//    public String getPassword() {
//        return "";
//    }
//
//    @Override
//    public GrantedAuthority[] getAuthorities() {
//        return new GrantedAuthority[0];
//    }



}
