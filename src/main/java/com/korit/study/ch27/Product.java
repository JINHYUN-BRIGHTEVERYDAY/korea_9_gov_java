package com.korit.study.ch27;

public class Product {
    private String name;
    private Integer price;
    private String size;

    // 빌더가 사용할 생성자
    public Product() {
    }

    public Product(String name, Integer price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    // 1. 빌더 객체를 생성하는 정적 메서드 추가
    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    // (getter/setter와 toString()은 생략)
    // ...

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }


    // 2. ProductBuilder 클래스 (내부 클래스)
    public static class ProductBuilder {
        private String name;
        private Integer price;
        private String size;

        // 빌더의 생성자는 보통 private 또는 default로 둡니다.
        private ProductBuilder() {

        }

        // 3. 필드 설정 메서드가 ProductBuilder 자신(this)을 반환
        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder price(Integer price) {
            this.price = price;
            return this;
        }

        public ProductBuilder size(String size) {
            this.size = size;
            return this;
        }

        // 4. build() 메서드는 완성된 Product 객체를 반환
        public Product build() {
            return new Product(this.name, this.price, this.size);
        }
    }
}