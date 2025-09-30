package com.korit.study.ch11;

public class StudyMain {
    public static void main(String[] args) {

/*

         과목명 : JAVA 기초
         담당 선생님 이름: 김준일
         담당 선생님 나이: 32
         학생1의 ID: 20250001
         학생1의 이름: 박재현
         학생1의 나이: 24
         학생2의 ID: 20250002
         학생2의 이름: 고대한
         학생2의 나이: 19
         학생3의 ID: 20250003
         학생3의 이름: 양재원
         학생3의 나이: 27


         Study 객체 만들기
         Study study = new Study();



        Student[] student = new Student[2];


         학생에 대한 객체 생성
        Student student1 = new Student(int id, String name, int age);
        Student student2 = new Student(int id, String name, int age);

        Student student1 = new Student(id, name, age);
        Student student2 = new Student(id, name, age);
        Student[] students = new Student[] {student1, student2};


*/



        // 학생 객체 3개 생성
        Student student1 = new Student(20250001, "박재현", 24);
        Student student2 = new Student(20250002, "고대한", 19);
        Student student3 = new Student(20250003, "양재원", 27);


        // 학생 배열 생성 -> 3명의 학생을 추가
       Student[] students = new Student[] {student1, student2, student3};


       // 선생님 객체 생성
        Teacher teacher = new Teacher("김준일", 32);


        // 과목 객체 생성
        Subject subject = new Subject("JAVA 기초", teacher);


        // Study 객체 생성
        Study study = new Study(subject, students);


        // 객체 생성
        StudyPrintService studyPrintService = new StudyPrintService();
        studyPrintService.printInfoAll(study);


        System.out.println("--------------------------");

        // 출력하기
        System.out.println("과목명 : " + study.subject.name);
        System.out.println("담당 선생님 이름: " + study.subject.teacher.name);
        System.out.println("담당 선생님 나이: " + study.subject.teacher.age);

        System.out.println("학생1의 ID: " + study.students[0].id);
        System.out.println("학생1의 이름: " + study.students[0].name);
        System.out.println("학생1의 나이: " + study.students[0].age);

        System.out.println("학생2의 ID: " + study.students[1].id);
        System.out.println("학생2의 이름: " + study.students[1].name);
        System.out.println("학생2의 나이: " + study.students[1].age);

        System.out.println("학생3의 ID: " + study.students[2].id);
        System.out.println("학생3의 이름: " + study.students[2].name);
        System.out.println("학생3의 나이: " + study.students[2].age);



/*

        Teacher teacher1 = new Teacher("김준일", 32);
        teacher1.name = "김준일";
        teacher1.age = 32;




        Study study = new Study("JAVA기초", teacher1.name, teacher1.age);

*/

    }
}
