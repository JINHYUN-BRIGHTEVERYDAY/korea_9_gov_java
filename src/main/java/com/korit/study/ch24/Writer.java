package com.korit.study.ch24;

public class Writer {
    public String writer;
    public int age;

    // 생성자
    public Writer(String writer, int age) {
        this.writer = writer;
        this.age = age;
    }


    //getter
    public String getWriter() {
        return writer;
    }

    public int getAge() {
        return age;
    }


    //setter
    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Writer{" +
                "writer='" + writer + '\'' +
                ", age=" + age +
                '}';
    }


}
