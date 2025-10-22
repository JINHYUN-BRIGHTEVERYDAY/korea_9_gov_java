package com.korit.study.ch23;

import java.lang.reflect.Array;
import java.util.ArrayList;


class User {
    String username;
    String password;

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

}


// User 클래스 상속받음
class VipUser extends User {
    public VipUser(String username, String password) {
        super(username, password);
    }
}

// User 클래스 상속받음
class GoldUser extends User {
    public GoldUser(String username, String password) {
        super(username, password);
    }
}



public class WildCardMain {
    public static void main(String[] args) {
        WildCardMain main = new  WildCardMain();
//        ArrayList<String> names = new ArrayList<>();
//        names.add("김준일");
//        names.add("김준이");
//        names.add("김준삼");
//
//
//        // printAll은 static 메서드가 아님
//        // 객체를 생성하고 메서드 호출하기

//        main.printAll(names);


        // 제네릭 타입을 User로 받음
        // 컬렉션 안에 생성된 User 객체 담겨야함
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("test1", "1234"));
        users.add(new User("test2", "5678"));
        users.add(new User("test3", "1111"));
        main.printAll(users);


        ArrayList<VipUser> vipUsers = new ArrayList<>();
        vipUsers.add(new VipUser("vip1", "1234"));
        vipUsers.add(new VipUser("vip2", "5678"));
        vipUsers.add(new VipUser("vip3", "1111"));
        main.printAll(vipUsers);


        ArrayList<GoldUser> goldUsers = new ArrayList<>();
        goldUsers.add(new GoldUser("vip1", "1234"));
        goldUsers.add(new GoldUser("vip2", "5678"));
        goldUsers.add(new GoldUser("vip3", "1111"));
        main.printAll(goldUsers);

        // User를 상속받지 않은 건 와일드카드더라도 불가능
    }


    // T -> 클래스 정의하는 부분에

    // public void printAll(ArrayList<Object> list) (X)
//    public void printAll(Object list) {
//        // ArrayList로 다운캐스팅
//        for (Object s : (ArrayList) list) {
//            System.out.println(s);
//        }
//    }

    // 무엇이 들어올지 모른다 -> 와일드카드
    public void printAll(ArrayList<? extends User> list) {
        // String a = list.get(0); -> 단정지을 수 없다 -> Object 써야
        // ArrayList로 다운캐스팅
        for (User s : list) {
            System.out.println(s);
        }

        // 안에 들어있는건 다운캐스팅 해야한다
    }

    /*

    와일드 카드 >>> '?' 기호
    어떤 타입인지 알 수 없다, 즉, 모든 타입을 유추하여 받을 수 있는 방법

    상한 경계 와일드 카드 : extends >>>  ? extends User
    -> 최대 업캐스팅 간으한 범위를 User로 하겠다, 즉, 상한선을 정하겠다는 의미


    하한 경계 와일드 카드 : super >>> ? super GoldUser
    -> 해당 객체부터 상위로 모든 범위를 지정하겠다, 즉 Object부터 GoldUser객체까지 하한선을 정하겠다는 의미


    */
}

//    public void printAll(ArrayList<? super GoldUser> list) {
//        // String a = list.get(0); -> 단정지을 수 없다 -> Object 써야
//        // ArrayList로 다운캐스팅
//        for (Object s : list) {
//            System.out.println(s);
//        }
//
//        // 안에 들어있는건 다운캐스팅 해야한다
//    }



//    public void printAll(ArrayList<?> list) {
//        // String a = list.get(0); -> 단정지을 수 없다 -> Object 써야
//        // ArrayList로 다운캐스팅
//        for (Object s : list) {
//            System.out.println(s);
//        }
//
//        // 안에 들어있는건 다운캐스팅 해야한다
//    }

    // 다운캐스팅을 원하지 않는다면 아래와 같이 오버로딩
    // 메서드 명도 바꾸어주어야
//    public void printAll(ArrayList<String> list) {
//        // String a = list.get(0); -> 단정지을 수 없다 -> Object 써야
//        // ArrayList로 다운캐스팅
//        for (String s : list) {
//            System.out.println(s);
//        }
//
//        // 안에 들어있는건 다운캐스팅 해야한다
//    }
//
//    public void printAll(ArrayList<User> list) {
//        // String a = list.get(0); -> 단정지을 수 없다 -> Object 써야
//        // ArrayList로 다운캐스팅
//        for (User s : list) {
//            System.out.println(s);
//        }
//
//        // 안에 들어있는건 다운캐스팅 해야한다
//    }

