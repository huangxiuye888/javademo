package com.hxy.create;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int[] list=new int[5];
        Random r=new Random();
        for(int i=0;i<list.length;i++){
            list[i]=r.nextInt(20)+1;
        }
        Scanner sc=new Scanner(System.in);
        OUT:
        while(true){
            System.out.println("输入一个1-20的数进行猜测");
            int guess=sc.nextInt();
            for(int i=0;i<list.length;i++){
                if(list[i]==guess){
                    System.out.println("才对了，索引是"+i);
                    break OUT;
                }
            }
            System.out.println("当前猜错了，重新猜");
        }
        for (int i=0;i<list.length;i++){
            System.out.println(list[i]+"\t");
        }
    }
}
