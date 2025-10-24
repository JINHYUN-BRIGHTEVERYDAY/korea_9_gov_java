package com.korit.study.ch27;

public class BuilderMain {
    public static void main(String[] args) {
        BuilderStudy builderStudy = new BuilderStudy("김준일", 32);

        BuilderStudy builderStudy1 = BuilderStudy.builder()
                .value2(32)
//                .value1("김준일")
                // 순서 상관없고 넣고싶은것만 넣어도 된다
                .build();

        // 필터, 토큰 -> 빌더 패턴으로 접근


        // ---------------------------------------------------------


        // Product.builder()를 호출하여 ProductBuilder 인스턴스를 얻어오기
        Product product = Product.builder()
                .name("노트북")    // name() 메서드가 ProductBuilder를 반환
                .price(1500000) // price() 메서드가 ProductBuilder를 반환
                .size("15인치")  // size() 메서드가 ProductBuilder를 반환
                .build();       // build() 메서드가 완성된 Product 객체를 반환

        System.out.println(product);
        // 출력: Product{name='노트북', price=1500000, size='15인치'}

        // 원하는 필드만 설정할 수 있습니다.
        Product product2 = Product.builder()
                .name("키보드")
                .price(80000)
                // size는 설정하지 않음 (null 또는 기본값)
                .build();

        System.out.println(product2);
        // 출력: Product{name='키보드', price=80000, size='null'}
    }
}
