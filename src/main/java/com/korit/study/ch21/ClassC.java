// [Class C] - 수정된 코드
package com.korit.study.ch21;

public class ClassC {
    public void run() {
        // 공유 인스턴스에 접근
        Singleton.getInstance().changeData();
        Singleton.getInstance().deleteData();
    }
}