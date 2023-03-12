package com.hxy.branch;

public class SwitchDemo2 {
    public static void main(String[] args) {
        String weekday="周三";
        switch(weekday){
            case "周一":
                System.out.println("摆烂");
                break;
            case "周二":
                System.out.println("吃饭");
                break;
            case "周三":
                System.out.println("玩");
                break;
            case "周四":
                System.out.println("旅游");
                break;
            case "周五":
                System.out.println("看书");
                break;
            case "周六":
                System.out.println("喝");
                break;
            default:
                System.out.println("等死");
        }
    }
}
