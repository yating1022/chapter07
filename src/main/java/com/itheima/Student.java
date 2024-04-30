package com.itheima;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component("student")
public class Student {
    @Value("1")
    private int id;
    @Value("张三")
    private String name;
    @PostConstruct
    public void init(){
        System.out.println("Bean对象被初始化");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("被销毁之前执行");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
