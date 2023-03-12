package com.hxy.create;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int[] codes=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<codes.length;i++){
            System.out.println("请输入第"+(i+1)+"个工号");
            int code=sc.nextInt();
            codes[i]=code;
        }
        Random r=new Random();
        for (int i=0;i<codes.length;i++){
            int j=r.nextInt(codes.length);
            int num=codes[i];
            codes[i]=codes[j];
            codes[j]=num;
        }
        for (int i=0;i<codes.length;i++){
            System.out.println(codes[i]+"\t");
        }
    }
}
