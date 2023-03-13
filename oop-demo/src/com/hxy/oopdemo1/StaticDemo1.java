package com.hxy.oopdemo1;

public class StaticDemo1 {
    public static void main(String[] args) {
        User.name="张三";
        System.out.println(User.name);
        System.out.println(User.getMax(13, 15));
    }
}
