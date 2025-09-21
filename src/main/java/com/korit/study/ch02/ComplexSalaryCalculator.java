package com.korit.study.ch02;

public class ComplexSalaryCalculator {
    public static void main(String[] args) {
        // 테스트 데이터
        int baseSalary = 4000000;
        int workYears = 12;
        int position = 3;
        int overtimeHours = 15;

        // 직급수당 계산
        int positionAllowance =
                (position == 1) ? 0 :
                        (position == 2) ? 500000 :
                                (position == 3) ? 1000000 :
                                        (position == 4) ? 2000000 : 0;

        // 연차수당 비율 (정수 %값)
        int yearRate =
                (workYears < 3) ? 0 :
                        (workYears < 7) ? 5 :
                                (workYears < 15) ? 10 : 20;

        int yearAllowance = (baseSalary * yearRate) / 100;

        // 야근수당: 10시간 이하 = 시간당 1만원, 초과 = 기본 10시간 + 초과분 * 1.5만원
        int overtimeBase = (overtimeHours <= 10) ? overtimeHours : 10;
        int overtimeExtra = (overtimeHours > 10) ? (overtimeHours - 10) : 0;
        int overtimePayment = (overtimeBase * 10000) + (overtimeExtra * 15000);

        // 특별보너스: 부장 && 15년 이상 근무
        int specialBonus = ((position == 4) && (workYears >= 15)) ? 500000 : 0;

        // 총 지급액
        int totalSalary = baseSalary + positionAllowance + yearAllowance + overtimePayment + specialBonus;

        // 세율 결정
        int taxRate = (totalSalary <= 5000000) ? 10 : 15;
        int tax = (totalSalary * taxRate) / 100;

        // 실수령액
        int finalSalary = totalSalary - tax;

        // 직급명
        String positionName =
                (position == 1) ? "사원" :
                        (position == 2) ? "대리" :
                                (position == 3) ? "과장" :
                                        (position == 4) ? "부장" : "알 수 없음";

        // 야근수당 상세 설명
        String overtimeDetail =
                (overtimeHours <= 10) ? "(기본 " + overtimeHours + "시간)" :
                        "(기본 10시간 + 초과 " + (overtimeHours - 10) + "시간)";

        // 결과 출력
        System.out.println("=== 급여 명세서 ===");
        System.out.println("기본급: " + String.format("%,d", baseSalary) + "원");
        System.out.println("직급: " + positionName);
        System.out.println("직급수당: " + String.format("%,d", positionAllowance) + "원");
        System.out.println("연차수당: " + String.format("%,d", yearAllowance) + "원 (" + yearRate + "%)");
        System.out.println("야근수당: " + String.format("%,d", overtimePayment) + "원 " + overtimeDetail);
        System.out.println("특별보너스: " + String.format("%,d", specialBonus) + "원");
        System.out.println("총 지급액: " + String.format("%,d", totalSalary) + "원");
        System.out.println("세금(" + taxRate + "%): " + String.format("%,d", tax) + "원");
        System.out.println("실수령액: " + String.format("%,d", finalSalary) + "원");
    }
}

