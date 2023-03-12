package com.hxy.create;

public class MethodDemo1 {
    public static void main(String[] args) {
        int c=sum(10,20);
        System.out.println(c);
        int c1=sum(30,50);
        System.out.println(c1);
    }
    public static int sum(int a,int b){
        int c=a+b;
        return c;
    }
}
