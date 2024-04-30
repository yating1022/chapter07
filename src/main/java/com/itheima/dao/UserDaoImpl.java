package com.itheima.dao;

import com.itheima.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Repeatable;
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public void save(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User bean = (User)classPathXmlApplicationContext.getBean("user");
        System.out.println("执行UserDaoImpl.save()");
        System.out.println(bean);
    }

}
