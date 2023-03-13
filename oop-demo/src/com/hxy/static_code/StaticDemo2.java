package com.hxy.static_code;

import java.util.ArrayList;

public class StaticDemo2 {
    public static ArrayList<String> cards=new ArrayList<>();
    static{
        String[] sizes={"3","4","5","6","7","8","9","10","J","1","K","A","2"};
        String[] colors={"红桃","方片","黑桃","梅花"};
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                String card=sizes[i]+colors[j];
                cards.add(card);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(cards);
    }
}
