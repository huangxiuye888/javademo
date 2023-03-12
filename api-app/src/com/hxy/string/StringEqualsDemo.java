package com.hxy.string;

import java.util.Scanner;

public class StringEqualsDemo {
    public static void main(String[] args) {
        String okName="hxy";
        String okPassword="123456";
        Scanner sc=new Scanner(System.in);
        System.out.println("登录名称");
        String name = sc.next();
        System.out.println("登录密码");
        String password =sc.next();
        if(okName.equals(name)&&okPassword.equals(password)){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }
}
