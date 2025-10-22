package com.korit.study.ch24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
        /*
         컬렉션
         http://www.tcpschool.com/java/java_collectionFramework_concept
        */


        // 문자열을 담을 수 있는 ArrayList 생성;
        ArrayList<String> list = new ArrayList<>();
        // List<String> list = new ArrayList<>();
        // ArrayList든 LinkedList든 상관없다 -> 그러나 동작이 서로 달라진다

        // 값을 추가하기 -> add 메서드 호출하기
        list.add("문자열 값1");
        list.add("문자열 값2");


        /*
          값을 가져오기
         list는 순서가 있기 때문에 index가 존재한다
         index를 가져와서 값을 가져온다
        */
//        list.get(0);
//        list.get(1);


        // 값을 가져오기
        String str1 = list.get(0);
        String str2 = list.get(1);


        // 값을 수정하기 -> set
        String set3 = list.set(1, "문자열 값 3");
        System.out.println(set3);


        // 값 삭제
        boolean removed = list.remove("문자열 값1");
        System.out.println(removed);
        String str4 = list.remove(0);
        System.out.println(str4);

        // 삭제된 자리에 다음 인덱스의 값이 들어오게 된다



        // 리스트 안에 포함되어 있는지 확인
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("30");
        list.add("30");
        // 리스트의 크기 (사이즈)
        int size = list.size();
        System.out.println(size);

        System.out.println(list.contains("50"));



        // 리스트 안에서 값이 위치하고 있는 Index를 찾기
        // 앞에서부터 찾기
        int indexOf30 = list.indexOf("30");
        // 중복을 허용하기 때문에 앞에서부터 찾고 맨 앞에서 찾아진 인덱스를 출력한다
        System.out.println(indexOf30);


        // 중간에 위치하고 있는 데이터 30의 index를 찾는 방법
        int start = list.indexOf("30") + 1;
        indexOf30 = -1; // 값이 없는 상황을 가정

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("30")) {
                indexOf30 = i;
                break; // 가운데 있는 것을 찾게 된다
            }
        }

        // 뒤에서부터 찾기
        indexOf30 = list.indexOf("30");
        System.out.println(indexOf30);


        // 리스트 자르기
//        System.out.println(list.subList(0, 2));

        // 새로운 리스트를 만들어버림
        List<String> subList = list.subList(list.indexOf("30"), list.size());
        subList.indexOf("30");
        subList.add("40");
        System.out.println(subList);


        // LinkedList 선형 리스트
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("10");
        linkedList.add("20");
        linkedList.add("30");
        linkedList.add("40");
        linkedList.indexOf("30");

        /*
                public int indexOf(Object o) {
                return indexOfRange(o, 0, size);
            }

            int indexOfRange(Object o, int start, int end) {
                Object[] es = elementData;
                if (o == null) {
                    for (int i = start; i < end; i++) {
                        if (es[i] == null) {
                            return i;
                        }
                    }
                } else {
                    for (int i = start; i < end; i++) {
                        if (o.equals(es[i])) {
                            return i;
                        }
                    }
                }
                return -1;
            }


        */

    }
}

