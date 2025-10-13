package com.korit.study.ch18;

public class 다형성 {
    public static void main(String[] args) {

        // 전원 객체 생성 -> 배열로 생성함
        전원[] 전원들 = new 전원[2];

        // 전원에 대한 객체를 컴퓨터로 캐스팅하여
//        전원들[0] = new 컴퓨터(20); // -> 업캐스팅 해야 함
//
//        전원들[1] = new 조명(10); // -> 업캐스팅 해야 함

        /*

        public 컴퓨터(int 전압) {
            super(전압);
        }

        public 조명(int 전압) {
            super(전압);
        }

        */

        전원들[0] = new 컴퓨터(20);
        전원들[1] = new 조명(10);



        // 향상된 for문
        // 전원[] 전원들 = new 전원[2]; 이므로

        for (전원 p : 전원들) {
            p.켠다();
        }

        for (전원 p : 전원들) {
            p.끈다();
        }

        for (전원 p : 전원들) {
            System.out.println(((전자기기) p).get전압());
        }

        // 전자기기에 있는 메서드를 사용하기 위함
        // getter 사용
        // System.out.println(((전자기기) 전원[0]).get전압());


        // 조명에만 들어있던 메서드
//        for (전원 p : 전원들) { -> 캐스팅 오류, 컴퓨터에 대한 건 다운캐스팅을 잘 하지만 뒤에 오는 조명을 처리하지못한다
//            ((컴퓨터) p).바이오스부팅();
//        }


        // 클래스, 오브젝트, 인스턴스
        for (전원 p : 전원들) {
            if (p instanceof 컴퓨터) {
                ((컴퓨터) p).바이오스부팅();
            } else if (p instanceof 조명) {
                ((조명) p).조명교체필요();
            }
        }
    }
}
