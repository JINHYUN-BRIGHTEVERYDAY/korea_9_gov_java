package com.korit.study.ch03;

import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 텍스트 문자를 드래그한 상태에서 큰따옴표 키보드 입력하면 동시에 문자열로 변환
        // Alt + Shift 누르면 동시에

        System.out.println("=== 고객 정보 입력하기 ====");

        System.out.print("고객 ID를 입력하세요: ");
//        String iD = scanner.nextLine();
        String iD = scanner.next();

        System.out.print("상품코드를 입력하세요: ");
        String productCode = scanner.nextLine();

        System.out.print("상품명을 입력하세요: ");
        String productName = scanner.nextLine();

        System.out.print("상품의 구매 수량을 입력하세요: ");
        int purchaseQuantity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("상품의 단가를 입력하세요: ");
        int purchasePrice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("배송받을 우편번호를 입력하세요: ");
        int postNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("배송받을 주소를 입력하세요: ");
        String address = scanner.nextLine();

        scanner.close();

        System.out.println("");
        System.out.println("");
        System.out.println("===== 계산 로직에 따른 결과 =====");

        // 총 상품 가격 = 단가 * 수량
        int totalProductPrice = purchasePrice * purchaseQuantity;
        System.out.println("고객께서 주문하신 총 상품의 가격 합계는: " + totalProductPrice + "입니다.");

        // 배송비: 3만원 이상 구매시 무료, 미만시 3000원 부과
        int purchaseFee = totalProductPrice >= 30000 ? 0 : 3000;

        // 최종 금액 = 상품 가격 + 배송비
        int finalTotalProductPrice = totalProductPrice + purchaseFee;

        System.out.println("");
        System.out.println("");
        System.out.println("===== 주문 확인서 =====");

        System.out.println("고객 ID: " + iD); // 고객 ID는 %s로 처리

        System.out.println("상품 정보: ");
        System.out.println("    -  상품코드: " + productCode); // 상품코드는 %s 처리
        System.out.println("    -  상품명: " + productName); // 상품명은 %s 처리
        System.out.println("    -  단가: " + purchasePrice + "원 * " + purchaseQuantity + "개 = " + totalProductPrice + "원");
        //단가는 %,d원 * %,d개


        System.out.println("배송 정보: ");
        System.out.println("    -  우편번호: " + postNumber); // 우편번호는 %d 처리
        System.out.println("    -  주소: " + address); // 주소는 %s 처리

        String comment = totalProductPrice >= 30000 ? "무료 (3만원 이상 구매)" : "3000원";
        System.out.println("    -  배송비: " + comment);

        System.out.println("총 결제 금액: " + finalTotalProductPrice + "원");

    }
}
