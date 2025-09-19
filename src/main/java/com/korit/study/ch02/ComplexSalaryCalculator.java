package com.korit.study.ch02;

public class ComplexSalaryCalculator {
    public static void main(String[] args) {
        // 테스트 데이터
        int baseSalary = 4000000;
        int workYears = 12;
        int position = 3;
        int overtimeHours = 15;

        // 여기에 삼항 연산자를 사용한 계산 로직을 작성하세요
        // 직급수당 계산

//        int 사원 = 1;
//        int 대리 = 2;
//        int 과장 = 3;
//        int 부장 = 4;

        int positionAllowance = position == 1 ? 0 : (position == 2 ? 500000 : (position == 3 ? 1000000 : 2000000));
//        System.out.println(positionAllowance);

        // 연차수당 계산 (기본급 기준 %)
        int yearAllowance = workYears < 3 ? positionAllowance * 0 : (workYears >= 3 && workYears <= 7 ? (int)(positionAllowance * 0.05) : (workYears >= 7 && workYears <=15? (int)(positionAllowance * 0.1) : (int)(positionAllowance * 0.2) ));
//        System.out.println(yearAllowance);

        // 야근수당 계산
        int overtimePayment = overtimeHours <= 10 ? 10000*overtimeHours : 15000*overtimeHours;
//        System.out.println(overtimePayment);

        // 특별보너스 계산
        int specialBonus = position != 4 ? 0 : (workYears < 15 ? 0 : 50);
//        System.out.println(specialBonus);

        // 총 지급액 계산
        int totalSalary = baseSalary + positionAllowance + yearAllowance + overtimeHours + specialBonus;
//        System.out.println(totalSalary);

        // 세금 계산
        int tax = (int) (totalSalary * 0.15);
//        System.out.println(tax);

        // 실수령액 계산
        int finalSalary = totalSalary - tax;
//        System.out.println(finalSalary);

        // 직급명 출력용
        String positionName = position == 1? "사원" : (position == 2? "대리" : (position == 3? "과장": "부장"));
//        System.out.println(positionName);

        // 결과 출력
        System.out.println("=== 급여 명세서 ===");
        System.out.println("기본급: " + String.format("%,d", baseSalary) + "원");
        System.out.println("직급: " + positionName);
        System.out.println("직급수당: " + positionAllowance + "원");
        System.out.println("연차수당: " + yearAllowance + "원");
        System.out.println("야근수당: " + overtimePayment + "원");
        System.out.println("특별보너스: " + specialBonus + "원");
        System.out.println("총지급액: " + totalSalary + "원");
        System.out.println("세금: " + tax + "원");
        System.out.println("실수령액: " + finalSalary + "원");


    }
}
