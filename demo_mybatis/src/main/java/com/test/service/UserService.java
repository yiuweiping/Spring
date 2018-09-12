package com.test.service;
import  com.test.entity.User;
import  java.util.List;

public  interface  UserService {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);

}