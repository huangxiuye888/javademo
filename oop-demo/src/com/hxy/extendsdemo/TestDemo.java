package com.hxy.extendsdemo;

public class TestDemo {
    public static void main(String[] args) {
        NewPhone np=new NewPhone();
        np.call();
        np.sendMsg();
    }
}
class NewPhone extends Phone{
    @Override
    public void call(){
        super.call();
        System.out.println("视频通话");
    }
    @Override
    public void sendMsg(){
        super.sendMsg();
        System.out.println("发图片");
    }
}
class Phone {
    public void call(){
        System.out.println("打电话");
    }
    public void sendMsg(){
        System.out.println("发短信");
    }
}
