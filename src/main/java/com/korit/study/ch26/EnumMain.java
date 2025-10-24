package com.korit.study.ch26;

enum Name {
    준일, 준이, 준삼
}

enum Name2 {
    N1("준일"), N2("준이"), N3("준삼");

    private String value;

    // 생성자
    Name2(String value) {
        this.value = value;
    }

    //public은 쓸 수 없다 -> 상수취급


//    String name() {
//        return name;
//    }

    // getter메서드
    public String value() {
        return value;
    }

}


enum Writer {
    W1("김준일", 32), W2("김준이", 33), W3("김준삼", 34);

    private final String fullName;
    private final Integer age;

    Writer(String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
    }

    // final 때문에 getter만 생성가능
    public String getFullName() {
        return fullName;
    }

    public Integer getAge() {
        return age;
    }


}

// enumerated -> 열거, 나열
public class EnumMain {
    public static void main(String[] args) {
        System.out.println(Name.준일);
        System.out.println(Name.준이);
        System.out.println(Name.준삼);

        // System.out.println(Name2.N1.name()); -> 가능
        System.out.println(Name2.N1.value());
        System.out.println(Name2.N2.value());
        System.out.println(Name2.N3.value());

        System.out.println(Writer.W1.getFullName());
        System.out.println(Writer.W1.getAge());


        // 백엔드 httpScrs
        Writer writer = Writer.W1;

    }
}
