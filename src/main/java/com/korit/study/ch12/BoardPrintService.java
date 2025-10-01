package com.korit.study.ch12;

public class BoardPrintService {

    void printAll(Board[] boards) {
        System.out.println("게시글 정보 전체 출력하기");



        // 인덱스 필요한 상황에서 사용
        for (int i = 0; i < boards.length; i++) {
            Board board = boards[i];
            System.out.println("게시글 번호: " + board.boardid);
            System.out.println("게시글 제목: " + board.boardtitle);
            System.out.println("게시글 내용: " + board.contents);
            System.out.println("게시글 작성자 ID: " + board.writer.id);

            for (int j = 0; j < board.comment.length; j++) {
                Comment comment = board.comment[j];
                System.out.println("댓글 ID: " + comment.id);
                System.out.println("댓글 내용: " + comment.content);
                System.out.println("댓글 작성자 ID: " + comment.writer.id);
                System.out.println("댓글 작성자 이름: " + comment.writer.writername);
            }

        }



        // 인덱스가 필요하지 않은 상황에서 사용
        for (Board board : boards) {
            System.out.println("게시글 번호: " + board.boardid);
            System.out.println("게시글 제목: " + board.boardtitle);
            System.out.println("게시글 내용: " + board.contents);
            System.out.println("게시글 작성자 ID: " + board.writer.id);

            for (Comment comment : board.comment) {
                System.out.println("댓글 ID: " + comment.id);
                System.out.println("댓글 내용: " + comment.content);
                System.out.println("댓글 작성자 ID: " + comment.writer.id);
                System.out.println("댓글 작성자 이름: " + comment.writer.writername);
            }
        }

    }
}
