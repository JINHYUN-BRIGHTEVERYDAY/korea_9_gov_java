package com.korit.study.ch02;

public class GameCharactorCalculator {
    public static void main(String[] args) {
        // 테스트 데이터
        int level = 75;
        int jobCode = 1;
        int equipGrade = 4;
        int skillPoints = 95;

        // 직업별 계수 계산 (삼항 연산자 사용)
        double jobMultiplier = (jobCode == 1) ? 1.5 :
                (jobCode == 2) ? 1.2 :
                        (jobCode == 3) ? 1.3 :
                                (jobCode == 4) ? 1.1 : 1.0;

        // 기본 능력치 계산
        int baseStats = (int)(level * jobMultiplier);

        // 장비 보정 계산 (%)
        double equipBonusRate = (equipGrade == 1) ? 0.0 :
                (equipGrade == 2) ? 0.10 :
                        (equipGrade == 3) ? 0.25 :
                                (equipGrade == 4) ? 0.50 :
                                        (equipGrade == 5) ? 1.0 : 0.0;
        int equipBonus = (int)(baseStats * equipBonusRate);

        // 스킬 보너스 계산 (최대 50%)
        double skillBonusRate = (skillPoints / 10) * 0.05;
        skillBonusRate = (skillBonusRate > 0.5) ? 0.5 : skillBonusRate;
        int skillBonus = (int)(baseStats * skillBonusRate);

        // 직업 특성 보너스 계산
        double specialBonusRate =
                (jobCode == 1) ? ((level >= 50) ? 0.20 : 0.0) :
                        (jobCode == 2) ? ((skillPoints >= 80) ? 0.30 : 0.0) :
                                (jobCode == 3) ? ((equipGrade >= 4) ? 0.25 : 0.0) :
                                        (jobCode == 4) ? ((level % 2 == 1) ? 0.15 : 0.0) : 0.0;
        int jobSpecialBonus = (int)(baseStats * specialBonusRate);

        // 최종 능력치 계산
        int finalStats = baseStats + equipBonus + skillBonus + jobSpecialBonus;

        // 전투력 등급 계산
        String combatRank = (finalStats >= 8000) ? "S" :
                (finalStats >= 6000) ? "A" :
                        (finalStats >= 4000) ? "B" :
                                (finalStats >= 2000) ? "C" : "D";

        // 직업명 계산
        String jobName = (jobCode == 1) ? "전사" :
                (jobCode == 2) ? "마법사" :
                        (jobCode == 3) ? "궁수" :
                                (jobCode == 4) ? "도적" : "알 수 없음";

        // 결과 출력
        System.out.println("=== 캐릭터 스탯 ===");
        System.out.println("직업: " + jobName + " (Lv." + level + ")");
        System.out.println("기본 능력치: " + baseStats);
        System.out.println("장비 보정: +" + equipBonus + " (" + (int)(equipBonusRate * 100) + "% 보너스)");
        System.out.println("스킬 보너스: +" + skillBonus + " (" + (int)(skillBonusRate * 100) + "% 보너스)");
        System.out.println("직업 특성 보너스: +" + jobSpecialBonus + " (" + (int)(specialBonusRate * 100) + "% 보너스)");
        System.out.println("최종 능력치: " + finalStats);
        System.out.println("전투력 등급: " + combatRank);
    }
}

