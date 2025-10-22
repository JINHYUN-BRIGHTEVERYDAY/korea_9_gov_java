package com.korit.study.ch23;


public class GenericMain {

    public static void main(String[] args) {
        NonGeneric a = new NonGeneric("문자열 데이터");
        NonGeneric b = new NonGeneric(10);
        NonGeneric c = new NonGeneric(new NonGeneric(null));
        NonGeneric d = new NonGeneric(a);
        NonGeneric[] arr = {a, b, c, d};

        for (NonGeneric n : arr) {
            System.out.println(n.getData().getClass());
            if (n.getData() instanceof String data) {
//                String data = (String) n.getData();
                System.out.println(data);
            } else if (n.getData() instanceof NonGeneric data) {
                System.out.println(data.getData());
            }
        }

        // <> 으로 안에 타입을 명시해주지 않으면 object가 된다
        // 꺽새 안을 비워두기
        Generic<String, Integer> e = new Generic<String, Integer>("문자열 데이터", "", 3.14, 10);

        // int, Integer
        Generic<String, Integer> f = new Generic<>("문자열 데이터", "", 3.14, 10);
//        e.getData()

        // Object 객체만 들어가야함
        // 배열 -> 일반 자료형 -> 제네릭 사용이 불가능
        // 자료구조 : https://seung-nari.tistory.com/entry/%EC%BB%B4%ED%93%A8%ED%84%B0-%EA%B5%AC%EC%A1%B0-%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0

        Object[] arr2 = new Object[1];


    }

}
