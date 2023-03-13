package com.hxy.static_util;

import java.util.Random;

public class Check {
    private Check(){}
    public static String createVerify(int n){
        String code="";
        String list="zxcvbnmasdsfdjqlweioe";
        Random r=new Random();
        for (int i = 0; i < n; i++) {
            code+=list.charAt(r.nextInt(list.length()));
        }
        return code;
    }
}
