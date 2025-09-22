package com.korit.study.ch02;

public class ComplexSalaryCalculator {
    public static void main(String[] args) {
        // 테스트 데이터
        int baseSalary = 4000000;
        int workYears = 12;
        int position = 3;
        int overtimeHours = 15;

        // 직급수당 계산
        // 직급수당: 사원(0), 대리(50만), 과장(100만), 부장(200만)
        int positionAllowance =
                (position == 1) ? 0 :
                        (position == 2) ? 500000 :
                                (position == 3) ? 1000000 :
                                        (position == 4) ? 2000000 : -1;

        // 연차수당 비율 (정수 %값)
        // 연차수당: 3년 미만(0%), 3-7년(5%), 7-15년(10%), 15년 이상(20%)
        int yearRate =
                (workYears < 3) ? 0 :
                        (workYears < 7) ? 5 :
                                (workYears < 15) ? 10 : 20;

        int yearAllowance = (baseSalary * yearRate) / 100;

        /*
        * int yearAllowance = (int) (workYears < 3 ? baseSalary * 0 :
        *         workYears < 7 ? baseSalary * 0.05 :
        *         workYears < 15 ? baseSalary * 0.1 : baseSalary * 0.2);
        *
        * */

        // 야근수당: 10시간 이하 = 시간당 1만원, 초과 = 기본 10시간 + 초과분 * 1.5만원
        // boolean isOverTime = overtimeHours - 10 > 0;
        // int baseOverTime = isOverTime ? 10 : ovetimeHours;
        int overtimeBase = (overtimeHours <= 10) ? overtimeHours : 10;
        int overtimeExtra = (overtimeHours > 10) ? (overtimeHours - 10) : 0;
        int overtimePayment = (overtimeBase * 10000) + (overtimeExtra * 15000);


        /*
         int overtimePayment = ovetimeHours < 11 ? overtimeHours * 10000:
               ((overtimeHours - 10) * 15000) + (10 * 10000);

        * */

        // 특별보너스: 부장 && 15년 이상 근무
        int specialBonus = ((position == 4) && (workYears >= 15)) ? 500000 : 0;

        // 총 지급액
        int totalSalary = baseSalary + positionAllowance + yearAllowance + overtimePayment + specialBonus;


        /*
        double taxRate = totalSalary <= 500000 ? 0.1 : 0.15;
        int tax = (int) (totalSalary * taxRate);
        * */

        // 세율 결정, 세금 계산
        int taxRate = (totalSalary <= 5000000) ? 10 : 15;
        int tax = (int)((totalSalary * taxRate) / 100);

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
        // %,d ---> %d
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

