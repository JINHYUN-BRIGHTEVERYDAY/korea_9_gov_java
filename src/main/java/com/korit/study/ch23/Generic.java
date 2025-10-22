package com.korit.study.ch23;

// 제네릭 -> 변수명, 대문자, 한 글자
// 제네릭 타입 여러 개 쓸 수 있다

// 제네릭은 참조 타입만을 쓸 수 있다, 일반 타입은 허용되지 않는다
public class Generic<T, T2> {
    private T data;
    private T data2;
    private Double data3;
    private T2 data4;
    private T[] arr;


    // 생성자
    public Generic(T data, T data2, Double data3, T2 data4) {
        this.data = data;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
//        arr = new T[10];
//        문법상 문제되는 것처럼 보이지 않지만 위에서 선언만 가능할 뿐 생성이 되지 않음
//        제네릭으로는 배열이 생성이 되지 않음
//        컬렉션으로 처리
    }

    // getter
    public T getData() {
        return data;
    }


}
