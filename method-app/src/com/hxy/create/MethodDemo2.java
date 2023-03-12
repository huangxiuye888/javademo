package com.hxy.create;

public class MethodDemo2 {
    public static void main(String[] args) {
        int res=add(1,2);
        System.out.println(res);
        print();
        print();
    }
    public static int add(int a,int b){
        int c=a+b;
        return c;
    }
    public static void print(){
        System.out.println("Hello-World");
        System.out.println("Hello-World");
        System.out.println("Hello-World");
        System.out.println("Hello-World");
    }
}
