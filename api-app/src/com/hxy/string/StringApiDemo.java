package com.hxy.string;

public class StringApiDemo {
    public static void main(String[] args) {
        String name="我爱你中国love";
        String names="我,你,他";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.toCharArray()[1]);
        System.out.println(name.substring(1,4));
        System.out.println(name.replace("中国","本溪"));
        System.out.println(name.contains("本溪"));
        System.out.println(name.startsWith("我爱"));
        System.out.println(name.startsWith("我爱",2));
        System.out.println(names.split(","));
    }
}
