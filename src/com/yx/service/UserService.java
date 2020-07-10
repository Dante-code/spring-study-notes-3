package com.yx.service;

import com.yx.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component(value = "userService")
public class UserService {

    @Autowired//根据类型注入
    @Qualifier(value = "Lucy")//根据名称注入
    private UserDao userDao;

    @Autowired
    @Qualifier(value = "Jack")
    private UserDao userDao2;

    public void add(){
        System.out.println("service add......");
        userDao.add();
        userDao2.add();
    }
}
