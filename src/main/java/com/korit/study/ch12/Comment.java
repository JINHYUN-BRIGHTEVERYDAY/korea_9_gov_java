package com.korit.study.ch12;

public class Comment {

    //Comment - id(정수), content(문자열), writer(Writer)
    int id;
    String content;
    Writer writer;


    // Comment에 대한 생성자 만들기
    public Comment(int id, String content, Writer writer) {
        this.id = id;
        this.content = content;
        this.writer = writer;
    }

//    Writer writer1 = new Writer(1, "김초엽");
//    Writer writer2 = new Writer(2, "김주혜");
//    Writer writer3 = new Writer(3, "레프톨스토이");

    // writer 객체 처리 필요
//    Comment commentA = new Comment(1, "SF소설", writer1);
//    Comment commentB = new Comment(2, "예술한미소설", writer2);
//    Comment commentC = new Comment(3, "러시아소설", writer3);

    // comments에 대한 배열 생성
//    Comment[] comments = new Comment[] {commentA, commentB, commentC};
}
