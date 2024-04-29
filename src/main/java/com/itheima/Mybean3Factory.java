package com.itheima;

public class Mybean3Factory {
    public Mybean3Factory(){
        System.out.println("Bean3工厂实例化中");
    }
    public Bean3 createBean(){
        return new Bean3();
    }
}
