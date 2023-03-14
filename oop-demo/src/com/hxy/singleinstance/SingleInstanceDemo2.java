package com.hxy.singleinstance;

public class SingleInstanceDemo2 {
    private static SingleInstanceDemo2 instance;
    private SingleInstanceDemo2(){}

    public static SingleInstanceDemo2 getInstance(){
        if(instance==null){
            instance=new SingleInstanceDemo2();
        }
        return instance;
    }
}
