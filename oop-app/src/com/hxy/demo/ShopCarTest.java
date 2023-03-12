package com.hxy.demo;

import java.util.Scanner;

public class ShopCarTest {
    public static void main(String[] args) {
//        定义商品类，用于创建商品对象
//        定义购物车对象，使用一个数组对象表示
        Goods[] shopCar=new Goods[100];
        System.out.println("请选择如下命令进行操作:");
        System.out.println("添加商品到购物车:add");
        System.out.println("查询商品到购物车:query");
        System.out.println("修改商品到购物车:update");
        System.out.println("购买商品到购物车:pay");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的命令");
        String type =sc.next();
        switch (type){
            case "add":
                addGoods(shopCar,sc);
                break;
            case "query":
                queryGoods(shopCar);
                break;
            case "update":
                updateGoods(shopCar);
                break;
            case "pay":
                payGoods(shopCar);
                break;
        }
    }

    private static void payGoods(Goods[] shopCar) {
    }

    private static void updateGoods(Goods[] shopCar) {
        
    }

    private static void queryGoods(Goods[] shopCar) {
        
    }

    private static void addGoods(Goods[] shopCar,Scanner sc) {
        System.out.println("倾听输入购买商品的编号");
        int id=sc.nextInt();
        System.out.println("倾听输入购买商品的名称");
        String name=sc.next();
        System.out.println("倾听输入购买商品的价格");
        double price=sc.nextDouble();
        System.out.println("倾听输入购买商品的编号数量");
        int buyNumber=sc.nextInt();
        Goods g=new Goods();
        g.id=id;
        g.name=name;
        g.price=price;
        g.buyNumber=buyNumber;
        for (int i=0;i<shopCar.length;i++){
            if(shopCar[i]==null){
                shopCar[i]=g;
                break;
            }
        }
        System.out.println("商品添加成功");
    }
}
