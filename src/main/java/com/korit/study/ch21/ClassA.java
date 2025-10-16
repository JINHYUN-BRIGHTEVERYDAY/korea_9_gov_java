// [Class A] - 수정된 코드
package com.korit.study.ch21;

public class ClassA {
    public void run() {

        // getInstance가 한번이라도 호출되었음
        Singleton.getInstance().changeData();
        Singleton.getInstance().deleteData();
    }
}