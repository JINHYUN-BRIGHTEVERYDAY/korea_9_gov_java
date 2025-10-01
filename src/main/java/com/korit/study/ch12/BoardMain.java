package com.korit.study.ch12;

public class BoardMain {
    public static void main(String[] args) {


        /*


        Board 배열 - board 배열 -> 게시글 2개
        Board - id (정수), title(문자열), contents(문자열), writer(Writer), comments(Comment[])

        Writer - id (정수), name(문자열)

        Comment - id (정수), contents(문자열), writer(Writer)

        1. Board 배열 2개의 공간 생성
        2. Writer 3명 생성
        3. Comment 4개 생성
        4. Board 2개 생성 -> 게시글 작성자와 댓글 작성자는 원하는 작성자를 주입한다


        */






        // 2. Writer 3명 생성
        // 작가에 대한 객체 생성

        Writer writer1 = new Writer(1, "김초엽");
        Writer writer2 = new Writer(2, "김주혜");
        Writer writer3 = new Writer(3, "레프톨스토이");

//        Writer[] writers = new Writer[3];
//        writers[0] = new Writer(1, "김초엽");
//        writers[1] = new Writer(2, "김주혜");
//        writers[2] = new Writer(3, "레프톨스토이");







        // 3. Comment 4개 생성
        //작성자 Comment에 대한 객체 생성 - id(정수), content(문자열), writer(Writer) 매개변수로 받기

        Comment commentA = new Comment(28, "SF소설", writer1);
        Comment commentB = new Comment(29, "예술한미소설", writer2);
        Comment commentC = new Comment(30, "러시아소설", writer3);
        Comment commentD = new Comment(31, "소설전반", writer3);






        // comments에 대한 배열 생성

        Comment[] comments = new Comment[] {commentA, commentB, commentC, commentD};
        comments[0] = commentA;
        comments[1] = commentB;
        comments[2] = commentC;
        comments[3] = commentD;










        //Board - id(정수) , title(문자열) , contents(문자열), writer(Writer), comments(Comment[])





        // 1. Board 배열 2개의 공간 생성
        //Board 배열 - boards -> 게시글 2개
        Board board1 = new Board(28, "김초엽의 소설을 읽고", "SF소설의 본질을 파헤치며", writer1, comments);
        Board board2 = new Board(29, "김주혜의 소설에 대한 총평", "예술한미소설의 감상평", writer2, comments);

        Board[] boards = new Board[] {board1, board2};





        // board1에 대한 정보 출력하기
        System.out.println("작성자 아이디는: " + boards[0].boardid);
        System.out.println("작성자 게시글의 제목은: " + boards[0].boardtitle);
        System.out.println("작성자 게시글의 내용은: " + boards[0].contents);
        System.out.println("작가의 아이디는: " + boards[0].writer.id);
        System.out.println("작가의 이름은: " + boards[0].writer.writername);
        System.out.println("작성자의 게시글 코멘트 아이디는: " + boards[0].comment[0].id);
        System.out.println("작성자의 게시글 코멘트 내용은: " + boards[0].comment[0].content);
        System.out.println("작성자의 게시글 코멘트에 대한 작가의 아이디는: " + boards[0].comment[0].writer.id);
        System.out.println("작성자의 게시글 코멘트에 대한 작가의 이름은: " + boards[0].comment[0].writer.writername);





        System.out.println("----------------------------------------------------");





        // board2에 대한 정보 출력하기
        System.out.println("작성자 아이디는: " + boards[1].boardid);
        System.out.println("작성자 게시글의 제목은: " + boards[1].boardtitle);
        System.out.println("작성자 게시글의 내용은: " + boards[1].contents);
        System.out.println("작가의 아이디는: " + boards[1].writer.id);
        System.out.println("작가의 이름은: " + boards[1].writer.writername);
        System.out.println("작성자의 게시글 코멘트 아이디는: " + boards[1].comment[1].id);
        System.out.println("작성자의 게시글 코멘트 내용은: " + boards[1].comment[1].content);
        System.out.println("작성자의 게시글 코멘트에 대한 작가의 아이디는: " + boards[1].comment[1].writer.id);
        System.out.println("작성자의 게시글 코멘트에 대한 작가의 이름은: " + boards[1].comment[1].writer.writername);


        /*
        * BoardPrintService boardPrintService = new BoardPrintService();
        * boardPrintService.printAll(boards);
        *
        * */

    }
}
