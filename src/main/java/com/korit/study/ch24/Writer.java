package com.korit.study.ch24;

import java.util.Objects;

public class Writer {
    private String writer;
    private int age;


    public Writer() {
    }

    public Writer(String writer, int age) {
        this.writer = writer;
        this.age = age;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Writer writer1)) return false;
        return age == writer1.age && Objects.equals(writer, writer1.writer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(writer, age);
    }


    @Override
    public String toString() {
        return "Writer{" +
                "writer='" + writer + '\'' +
                ", age=" + age +
                '}';
    }

}