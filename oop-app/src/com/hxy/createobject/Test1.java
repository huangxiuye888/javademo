package com.hxy.createobject;

public class Test1 {
    public static void main(String[] args) {
        Car c=new Car();
        c.name="奔驰";
        c.price=38.5;
        System.out.println(c.name);
        System.out.println(c.price);
        c.start();
        c.run();
    }
}
