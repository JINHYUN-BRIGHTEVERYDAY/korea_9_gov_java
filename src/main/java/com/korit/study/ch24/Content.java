package com.korit.study.ch24;

/*
(응용) : 객체화
*/

import com.korit.study.ch12.Board;

import java.util.List;
import java.util.Objects;

public class Content {
    // 멤버변수
    public String title;
    public Writer writer;
    public String boardContent;
    public List<Object> board;


    // 생성자
    public Content(String title, Writer writer, String boardContent, List<Object> board) {
        this.title = title;
        this.writer = writer;
        this.boardContent = boardContent;
        this.board = board;
    }


    // getter
    public String getTitle() {
        return title;
    }

    public Writer getWriter() {
        return writer;
    }

    public String getBoardContent() {
        return boardContent;
    }

    public List<Object> getBoard() {
        return board;
    }


    // setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void setBoardContent(String boardContent) {
        this.boardContent = boardContent;
    }

    public void setBoard(List<Object> board) {
        this.board = board;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Content content)) return false;
        return Objects.equals(title, content.title) && Objects.equals(writer, content.writer) && Objects.equals(boardContent, content.boardContent) && Objects.equals(board, content.board);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, writer, boardContent, board);
    }

    // toString
    @Override
    public String toString() {
        return "Content{" +
                "writer=" + writer +
                ", boardContent='" + boardContent + '\'' +
                ", board=" + board +
                '}';
    }


}
