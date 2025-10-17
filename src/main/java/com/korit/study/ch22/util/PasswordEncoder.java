package com.korit.study.ch22.util;

import java.util.Objects;

public class PasswordEncoder {

    private static final String secrete = "암호화비밀번호";

    public static String encode(String str) {
        if (Objects.isNull(str)) {
            return null;
        }
        long hash = Integer.toUnsignedLong(Objects.hash(str)); //  Long을 16진수로 변환
        long encodedHash = hash + Objects.hash(secrete);
        return Long.toHexString(encodedHash);
    }


//    public boolean match(String str, String encodedStr) {
//        if (Objects.hash(str))
//
//    }



    // 암호화된 것과 동일한지 검증하기
    // 여기서 암호문은 이미 암호처리가 완료된 것
    public static boolean match(String 평문, String 암호문) {
        //        String 암호문 = this.encode(평문);
//        return 암호문.equals(평문);


        // null인지 검증하고
        if (Objects.isNull(평문) || Objects.isNull(암호문)) {
            return false;
        }
        return encode(평문).equals(암호문);
    }


//    public boolean match(String str, String encodedStr) {
//        if (encode(secrete) != str) {
//            return true;
//        } else if (encode(secrete) == encodedStr) {
//            return false;
//        }
//    }
}
