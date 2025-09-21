package com.korit.study.ch02;

public class DynamicDiscountSystem {
    public static void main(String[] args) {
        // 테스트 데이터
        int productPrice = 25000;
        int memberGrade = 4;
        int quantity = 25;
        String couponCode = "VIP";

        // 총 상품 금액
        int totalAmount = productPrice * quantity;

        // 수량 할인율 계산
        double quantityDiscount = (quantity < 5) ? 0.0 :
                                        (quantity < 10) ? 0.05 :
                                                (quantity < 20) ? 0.10 : 0.15;

        // 회원 할인율 계산
        double memberDiscount = (memberGrade == 1) ? 0.0 :
                                    (memberGrade == 2) ? 0.03 :
                                            (memberGrade == 3) ? 0.07 :
                                                    (memberGrade == 4) ? 0.12 : 0.0;

        // 쿠폰 할인율 계산 (복합 조건)
        double couponDiscount =
                (couponCode.equals("SAVE10") && memberGrade >= 3) ? 0.10 :
                        (couponCode.equals("SAVE20") && memberGrade == 4) ? 0.20 :
                                (couponCode.equals("FIRST") && totalAmount >= 100000) ? 0.15 :
                                        (couponCode.equals("VIP") && memberGrade == 4 && quantity >= 20) ? 0.25 : 0.0;

        // 특별 할인 계산
        double specialDiscount = (memberGrade == 4 && quantity >= 20 && totalAmount >= 500000) ? 0.05 : 0.0;

        // 총 할인율 계산 (최대 50% 제한)
        double rawDiscountRate = quantityDiscount + memberDiscount + couponDiscount + specialDiscount;
        double totalDiscountRate = (rawDiscountRate > 0.5) ? 0.5 : rawDiscountRate;

        // 할인 금액 계산
        int discountAmount = (int)(totalAmount * totalDiscountRate);

        // 결제 금액 계산
        int paymentAmount = totalAmount - discountAmount;

        // 배송비 계산
        int shippingFee = (paymentAmount >= 30000 || memberGrade >= 3) ? 0 : 3000;

        // 최종 결제 금액
        int finalAmount = paymentAmount + shippingFee;

        // 회원 등급명
        String gradeName = (memberGrade == 1) ? "브론즈" :
                                (memberGrade == 2) ? "실버" :
                                        (memberGrade == 3) ? "골드" :
                                                (memberGrade == 4) ? "플래티넘" : "알 수 없음";

        // 결과 출력
        System.out.println("=== 주문 결산서 ===");
        System.out.println("회원 등급: " + gradeName);
        System.out.println("상품 단가: " + String.format("%,d", productPrice) + "원 × " + quantity + "개 = " + String.format("%,d", totalAmount) + "원");
        System.out.println();
        System.out.println("할인 내역:");
        System.out.println("- 수량 할인: " + (int)(quantityDiscount * 100) + "% (-" + String.format("%,d", (int)(totalAmount * quantityDiscount)) + "원)");
        System.out.println("- 회원 할인: " + (int)(memberDiscount * 100) + "% (-" + String.format("%,d", (int)(totalAmount * memberDiscount)) + "원)");
        System.out.println("- 쿠폰 할인(" + couponCode + "): " + (int)(couponDiscount * 100) + "% (-" + String.format("%,d", (int)(totalAmount * couponDiscount)) + "원)");
        System.out.println("- 특별 할인: " + (int)(specialDiscount * 100) + "% (-" + String.format("%,d", (int)(totalAmount * specialDiscount)) + "원)");
        System.out.println("총 할인율: " + (int)(totalDiscountRate * 100) + "% " + (rawDiscountRate > 0.5 ? "(상한 적용)" : ""));
        System.out.println("총 할인 금액: -" + String.format("%,d", discountAmount) + "원");
        System.out.println();
        System.out.println("결제 금액: " + String.format("%,d", paymentAmount) + "원");
        System.out.println("배송비: " + String.format("%,d", shippingFee) + "원");
        System.out.println("최종 결제 금액: " + String.format("%,d", finalAmount) + "원");
    }
}

