package com.hxy.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        Random r =new Random();
        int num=r.nextInt(10);
        System.out.println(num);
    }
}
