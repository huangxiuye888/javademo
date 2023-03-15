package com.hxy._abstract_test;

public class Test {
    public static void main(String[] args) {
        CardJin c=new CardJin();
        c.setMoney(10000);
        c.setName("张三");
        c.pay(300);
        System.out.println("您的余额"+c.getMoney());
        System.out.println("您的余额"+c.getName());
    }
}
