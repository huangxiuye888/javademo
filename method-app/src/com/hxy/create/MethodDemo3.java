package com.hxy.create;

public class MethodDemo3 {
    public static void main(String[] args) {
        fire();
        fire("英国");
        fire("英国",4);
    }
    public static void fire(){
        fire("美国");
    }
    public static void fire(String location){
        fire(location,1);
    }
    public static void fire(String location,int num){
        System.out.println("发射"+num+"枚武器给"+location);
    }
}
