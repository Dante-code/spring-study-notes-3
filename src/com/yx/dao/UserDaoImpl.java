package com.yx.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "Lucy")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("Lucy Dao add......");
    }
}

@Repository(value = "Jack")
class UserDaoImpl2 implements UserDao {
    @Override
    public void add() {
        System.out.println("Jack Dao add......");
    }
}

@Repository(value = "Mark")
class UserDaoImpl3 implements UserDao {
    @Override
    public void add() {
        System.out.println("Mark Dao add......");
    }
}
