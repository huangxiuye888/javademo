package com.hxy.string;

public class StringDemo1 {
    public static void main(String[] args) {
        String name="张三";
        System.out.println(name);
        String name1=new String("张三1");
        System.out.println(name1);
        char[] chars={'a','b','c'};
        String s=new String(chars);
        System.out.println(s);
        byte[] bytes={98,99,100,101};
        String s1=new String(bytes);
        System.out.println(s1);
    }
}
