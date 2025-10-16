// [SingletonMain] - 수정된 코드
package com.korit.study.ch21;

public class SingletonMain {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();

        // ⚠️ 더 이상 여기서 new Singleton()을 하지 않습니다.
        // Singleton singleton = new Singleton("Class Data");//<--- 삭제!
        // 또 다른 싱글톤을 만들어서는 안된다 이미 생성되었으니까
        // 생성자를 외부에서 만들 수 없도록 private로 만들었다
        // 싱글톤은 생성자의 접근지정자가 private로

        System.out.println("--- Class A 실행 ---");
        a.run(); // A가 데이터를 설정하고 출력

        System.out.println("--- Class B 실행 ---");
        b.run(); // B가 A가 설정한 데이터를 덮어쓰고 출력

        System.out.println("--- Class C 실행 ---");
        c.run(); // C가 B가 설정한 데이터를 덮어쓰고 출력

//        System.out.println("--- 최종 데이터 확인 ---");
        // 어떤 클래스에서 접근하든 마지막 C가 설정한 데이터를 공유하고 있음을 확인
//        Singleton finalCheck = Singleton.getInstance();
//        finalCheck.changeData();
    }
}