package com.hxy.constructor;

public class Car {
    String name;
    double price;
    public Car(){
        System.out.println("无参数构造器");
    }
    public Car(String name, double price){
        System.out.println("有参数构造器");
        this.name=name;
        this.price=price;
    }
}
