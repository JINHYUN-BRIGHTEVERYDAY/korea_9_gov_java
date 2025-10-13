package com.korit.study.ch17;

public interface GrantedAuthority {

    String getAuthority();
    // 인터페이스의 메서드는 public을 붙이지 않더라도 public으로 인식하여 생략이 가능하다
    // 인터페이스만 public을 포함한다

}
