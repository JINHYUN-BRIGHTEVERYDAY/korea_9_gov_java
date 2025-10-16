package com.korit.study.ch20;


public class Product {
    private static int id;
    private String name;


    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

//
//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof Product product)) return false;
//        return id == product.id && Objects.equals(name, product.name);
//    }
//
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(0, name);
//    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
