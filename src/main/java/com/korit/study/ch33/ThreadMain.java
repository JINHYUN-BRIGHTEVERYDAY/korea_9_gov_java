package com.korit.study.ch33;

class Counter {

    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized void decrement() {
        count--;
    }

    public synchronized int getCount() {
        return count;
    }

}

public class ThreadMain {
    public static void main(String[] args) {

        /*
        * Thread(스레드)
        * 싱글스레드와 멀티스레드
        *
        * 싱글스레드 : 스레드 하나만 사용의 의미 (main 메서드 하나만 사용)
        * 멀티스레드 : 스레드 두 개 이상의 사용
        */

//        int sum = 0;

        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("1번 반복문 : " + i);
                counter.increment();
//                sum += i;
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
//                sum += i;
                System.out.println("2번 반복문: " + i);
                counter.increment();
            }
        });

        System.out.println("스레드 시작");

        thread1.start();
        thread2.start();

//        System.out.println(counter.getCount());

        try {
            thread1.join();
            thread2.join();

            // 여기부터 Thread1과 Thread2가 종료될 때까지 기다려라

            System.out.println(counter.getCount());
            System.out.println("스레드 종료! ");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("스레드 종료");
    }
}
