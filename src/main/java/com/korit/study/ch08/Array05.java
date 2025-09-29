package com.korit.study.ch08;

// products ["아이폰17", ...]
// prices [120000, ....]


import java.util.Scanner;

public class Array05 {

    // 제품명에 대한 배열
    public static String[] products = new String[]
            {"아이폰 17", "아이폰 16", "갤럭시 S24",
            "갤럭시 S25", "아이폰 13", "아이폰 14",
            "갤럭시 S22", "갤럭시 S23, 갤럭시 S21"};


    // 해당 제품에 일치하는 가격 배열
    public static int[] prices = new int[]
            {120000, 160000, 130000,
            140000, 150000, 170000,
            180000, 190000, 200000};


    // 메인 실행 부분
    public static void main(String[] args) {
        // 추가하고 조회하고 수정하고 삭제하기 - 표제로 보여줄 것
        System.out.println("[휴대폰 상품명과 가격 조회하기]");

        // 어떤 메서드를 보여줄 것인가?
        showMainMenuView();
    }


    // 메인에 실행될 메서드 작성하기
    public static void showMainMenuView() {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;

        // while문에 있는 것이 true일 때 실행되므로 먼저 isExit 값이 true로 만들어져야 한다
        while(!isExit) {
            System.out.println("1. 이름과 가격 추가");
            System.out.println("2. 이름과 가격 조회");
            System.out.println("3. 이름과 가격 수정");
            System.out.println("4. 이름과 가격 삭제");
            System.out.println("0. 프로그램 종료하기");

            //메뉴를 다 보여준 다음에 선택하도록 유도함
            System.out.print("선택: ");
            int selectNumber = scanner.nextInt();
            scanner.nextLine(); // Enter는 버리기

            // 버튼을 누르면 해당 메서드가 실행되도록 함
            if (selectNumber == 0) {
                isExit = true; // 프로그램이 종료되도록
            } else if (selectNumber == 1) {
                register(); // 1번을 누르면 상품을 등록하는 메서드가 실행되도록 함, 주의해야 하는 건 add가 아님
            } else if (selectNumber == 2) {
                showNameList(); // 2번을 누르면 이름을 조회하는 메서드가 실행되도록 함
            }
        }
    }

    // 아래에서 이제 메인에 이어지는 세부 메서드를 짜야 한다

    // 1번을 눌렀을 때 실행될 메서드 register()
    public static void register() {

        // 스캐너를 사용하고
        Scanner scanner = new Scanner(System.in);
        String newName = null;
//        int newPrice = null;


        while(true) {
            System.out.println("[이름 추가 기능]");
            System.out.print("이름 입력: ");
            newName = scanner.nextLine();
//            System.out.println("[가격 추가 기능]");
//            System.out.println("가격 입력: ");
//            newPrice = scanner.nextInt();

            // 입력한 값이 없으면 입력을 할 수 없기 때문에 break로 반복되지 않고 루프를 빠져나가야 한다
            if(findByName(newName) == null ) {
                break;
            }
            System.out.println("이미 존재하는 이름입니다. 다시 입력해주세요");
        }
        // while문으로 실행이 된 다음에 이름 추가가 된 상황이므로
        add(newName);
        System.out.println("<이름 추가가 완료되었습니다>");
    }


    // 상품명을 찾는 메서드 작성
    public static String findByName(String name) {
        // 상품명을 매개변수로 받고 for-each로 하나씩 빼 와서 반복해야한다
        for (String p : products) {
            // 입력한 값이 일치한다면 그 입력값을 반환하고
            if(p.equals(name)) {
                return p;
            }
        }
        return null;
    }

    // 가격을 찾는 메서드 작성
//    public static int findByPrice(int price) {
//        for (int q : prices) {
//            if (q == price) {
//                return q;
//            }
//        }
//        return null;
//    }


    // 상품명을 추가하는 register에 들어갈 메서드
    // 본 메서드가 아님
    public static void add(String name) {
        String[] newArray = new String[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            newArray[i] = products[i];
        }
        newArray[newArray.length - 1] = name;
        products = newArray;
    }

    public static void showNameList() {
        Scanner scanner = new Scanner(System.in);
        int size = 2;
        while(true) {
            System.out.println("제품의 정보 조회");
            System.out.println("뒤로 가려면 0을 입력하세요");
            System.out.printf("페이지 번호 입력(1 ~ %d): ", getLastPage(2));
            int selectedPage = scanner.nextInt();
            scanner.nextLine();

            if (selectedPage == 0) {
                break;
            } else if (selectedPage > getLastPage(size)) {
                System.out.println("해당 페이지는 찾을 수 없는 페이지입니다.");
            } else {
                String[] namesOfPagination = pagination(selectedPage, size);//메서드;
                for (int i = 0; i < namesOfPagination.length; i++) {
                    System.out.printf("%d, %s\n", i + 1, namesOfPagination[i]);
                }
                System.out.println();
            }
        }
    }

    public static String[] pagination(int page, int size) {
        int startIndex = (page - 1) * size;
        int lastPage = getLastPage(size);
        boolean isLast = page == lastPage;
        int paginationArraySize = isLast? products.length % size : size;
        String[] paginationArray = new String[paginationArraySize];
        for (int i = startIndex; i < startIndex + paginationArraySize; i++) {
            paginationArray[i - startIndex] = products[i];
        }
        return paginationArray;
    }

    public static int getLastPage(int size) {
        return products.length % size == 0 ? products.length / size: products.length / size + 1 ;

    }
}
