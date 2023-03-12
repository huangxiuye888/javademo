package com.hxy.create;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int [] ages={12,23,44,222};
        System.out.println(ages[2]);

        int [] names=new int[3];
        names[0]=12;
        System.out.println(names[0]);
        for (int i=0;i<ages.length;i++){
            System.out.println(ages[i]);
        }
    }
}
