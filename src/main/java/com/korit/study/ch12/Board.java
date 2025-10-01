package com.korit.study.ch12;

public class Board {

    //Board - id(정수) , title(문자열) , contents(문자열), writer(Writer), comments(Comment[])
    int boardid;
    String boardtitle;
    String contents;
    Writer writer;
    Comment[] comment;


    // Board에 대한 생성자 생성
    public Board(int boardid, String boardtitle, String contents, Writer writer, Comment[] comment) {
        this.boardid = boardid;
        this.boardtitle = boardtitle;
        this.contents = contents;
        this.writer = writer;
        this.comment = comment;
    }

//    public Board(int boardid, String boardtitle, Writer writer, String contents, Comment[] comment) {
//        this.boardid = boardid;
//        this.boardtitle = boardtitle;
//        this.writer = writer;
//        this.contents = contents;
//        this.comment = comment;
//    }


//    Writer writer1 = new Writer(1, "김초엽");
//    Writer writer2 = new Writer(2, "김주혜");
//    Writer writer3 = new Writer(3, "레프톨스토이");
//
//    Comment commentA = new Comment(1, "SF소설", writer1);
//    Comment commentB = new Comment(2, "예술한미소설", writer2);
//    Comment commentC = new Comment(3, "러시아소설", writer3);
//
//    Comment[] comments = new Comment[] {commentA, commentB, commentC};
//
//
//    Board board1 = new Board(28, "김초엽의 소설을 읽고", "SF소설의 본질을 파헤치며", writer1, comments);
//    Board board2 = new Board(29, "김주혜의 소설에 대한 총평", "예술한미소설의 감상평", writer2, comments);
//
//    Board[] boards = new Board[] {board1, board2};


}
