package com.korit.study.ch23;


public class NonGeneric {
    private Object data;



    // 생성자 All
    public NonGeneric(Object data) {
        this.data = data;
    }


    // Getter
    public Object getData() {
        return data;
    }


    // Setter
    public void setData(Object data) {
        this.data = data;
    }


    // toString
    @Override
    public String toString() {
        return "NonGeneric{" +
                "data='" + data + '\'' +
                '}';
    }


}
