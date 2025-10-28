package com.korit.study.ch30.mapPractice1;

/*

문제 7: 여러 필드를 조합한 새 객체 생성

class Employee {
    String name;
    double salary;
    // constructor, getters
}

class EmployeeDTO {
    String displayName;
    String salaryInfo;
    // constructor, getters
}

List<Employee> employees = Arrays.asList(
    new Employee("Kim", 50000),
    new Employee("Lee", 60000)
);



Employee를 EmployeeDTO로 변환하세요.
displayName은 "Mr./Ms. {name}", salaryInfo는 "Salary: ${salary}"

예상 출력: [EmployeeDTO(Mr./Ms. Kim, Salary: $50000.0), ...]


 */

import java.util.Arrays;
import java.util.List;

class Employee{
    private String name;
    private double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


}


class EmployeeDto {
    String displayName;
    double salary;


    public EmployeeDto(String displayName, double salary) {
        this.displayName = displayName;
        this.salary = salary;
    }

    public String getDisplayName() {
        return displayName;
    }

    public double getSalary() {
        return salary;
    }

}

class UserSummary {
    private String fullName;
    private int salary;

    public UserSummary(String fullName, int salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "UserSummary{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                '}';
    }

}

public class Practice7 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Kim", 50000),
                new Employee("Lee", 60000)
        );

//        List<UserSummary> userSummaries = employees.stream()
//                .map(employee -> new UserSummary(
//                        employee.getName()
//                ));

    }
}
