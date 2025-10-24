package com.korit.study.ch24;

import java.util.Objects;

public class Comment {
    public Writer writer;
    public String content;


    public Comment() {
    }

     public Comment(Writer writer, String content) {
        this.writer = writer;
     }

    // getter


    public Writer getWriter() {
        return writer;
    }

    public String getContent() {
        return content;
    }


    // setter
    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Comment comment)) return false;
        return Objects.equals(writer, comment.writer) && Objects.equals(content, comment.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(writer, content);
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
