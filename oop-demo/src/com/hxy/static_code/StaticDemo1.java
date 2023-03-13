package com.hxy.static_code;

public class StaticDemo1 {
    public static String name;
    static {
        name="张三";
        System.out.println("静态代码块被执行");
    }
    {
        System.out.println("实例代码块被执行");
    }
    public StaticDemo1(){
        System.out.println("无参数构造器被执行");
    }
    public static void main(String[] args) {
        StaticDemo1 s=new StaticDemo1();
        StaticDemo1 s1=new StaticDemo1();
    }
}
