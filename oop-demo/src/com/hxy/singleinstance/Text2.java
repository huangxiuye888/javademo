package com.hxy.singleinstance;

public class Text2 {
    public static void main(String[] args) {
        SingleInstanceDemo2 s1=SingleInstanceDemo2.getInstance();
        SingleInstanceDemo2 s2=SingleInstanceDemo2.getInstance();
        System.out.println(s1 == s2);
    }
}
