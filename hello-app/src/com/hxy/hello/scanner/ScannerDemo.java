package com.hxy.hello.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("你的年龄:"+ age);
        System.out.println("请输入名字");
        String name=sc.next();
        System.out.println("你的名字:"+ name);
    }
}
