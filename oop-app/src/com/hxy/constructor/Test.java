package com.hxy.constructor;

public class Test {
    public static void main(String[] args) {
        Car c=new Car();
        System.out.println(c.name);
        System.out.println(c.price);
        Car c1=new Car("奔驰",12.23);
        System.out.println(c1.name);
        System.out.println(c1.price);
    }
}
