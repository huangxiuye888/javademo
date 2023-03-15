package com.hxy._abstract_template;

public abstract class AbstractTemplate {
    public final void write(){
        System.out.println("标题");
        System.out.println("开头");
        System.out.println(writeMain());
        System.out.println("结束");
    }
    public abstract String writeMain();
}
