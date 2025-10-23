package com.korit.study.ch24;

public class Comment {
    public String writer;
    public String content;


    // 생성자
    public Comment(String writer, String content) {
        this.writer = writer;
        this.content = content;
    }

    // getter
    public String getWriter() {
        return writer;
    }

    public String getContent() {
        return content;
    }

    // setter
    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setContent(String content) {
        this.content = content;
    }


    // toString
    @Override
    public String toString() {
        return "Comment{" +
                "writer='" + writer + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
