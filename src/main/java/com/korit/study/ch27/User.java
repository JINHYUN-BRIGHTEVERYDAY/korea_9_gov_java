package com.korit.study.ch27;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


    // 클래스 안에 클래스 정의
    public class UserPrinter {
        private String printValue;

        public UserPrinter(String printValue) {
            this.printValue = printValue;
        }

        public void print() {
            System.out.println(printValue);
        }

    }

    // 내부 클래스를 static으로
    public static class UserPrinter2 {
        private String printValue;

        public UserPrinter2(String printValue) {
            this.printValue = printValue;
        }

        public void print() {
            System.out.println(printValue);
        }

    }

}
