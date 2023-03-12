package com.hxy.branch;

public class ifDemo1 {
    public static void main(String[] args) {
        int hearBeat=30;
        if(hearBeat<60||hearBeat>100)
            System.out.println("您的心跳数据是："+hearBeat+",您可能需要进一步检查");
        System.out.println("检查结束");
        double money=1;
        if(money>=1314){
            System.out.println("您当前发送红包成功");
        }else{
            System.out.println("没钱了，发送失败");
        }
    }
}
