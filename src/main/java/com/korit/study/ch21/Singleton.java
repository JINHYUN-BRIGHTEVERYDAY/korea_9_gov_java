// [Class Singleton] - 수정된 코드
package com.korit.study.ch21;

import java.util.Objects;

public class Singleton {

    // 2. 유일한 단 하나의 인스턴스 (최초 생성 시점)
    private volatile static Singleton instance;
    //private static Singleton instance = new Singleton("초기 데이터");

    // public static Singleton singleton = new Singleton("초기 데이터");
    // private static Singleton singleton = new Singleton("초기 데이터");

    private String data;

    // 1. private 생성자: 외부에서 'new Singleton()'을 할 수 없게 막음
    // 생성자를 private로
    private Singleton(String data) {
        this.data = data;
    }

    // 3. public static 메서드: 유일한 인스턴스를 외부에 제공하는 통로
//    public static Singleton getInstance() {
//        return singleton;
//    }


    // getter 사용

    // ---- 동시성 해결 필요, 따라서 동기화 필요 ----

    public static Singleton getInstance() {

        // 메서드가 실행될 때마다 계속해서 instance가 생성되는 것을 막기 위해서
        if (Objects.isNull(instance)) {
            instance = new Singleton("Class Data");
        }
        return instance;
    }

    // 동시성 확인
    public static Singleton getSynchronizedInstance() {
        if (Objects.isNull(instance)) {
            synchronized (Singleton.class) {
                if (Objects.isNull(instance)) {
                    instance = new Singleton("Class Data");
                }
            }
        }
        return instance;
    }


    // 데이터 변경을 쉽게 확인하기 위한 setter 추가
    //    public void setData(String data) {
    //        this.data = data;
    //    }

    // 기존 메서드
    public void changeData() {
        System.out.println("데이터를 변경: " + data);
    }

    public void deleteData() {
        System.out.println("데이터 삭제: " + data);
    }
}