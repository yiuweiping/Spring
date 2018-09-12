package com.test.controller;
import org.springframework.web.bind.annotation.*;

import  org.springframework.beans.factory.annotation.Autowired;
import com.test.service.UserService;
import com.test.entity.User;

@RestController
@RequestMapping(value = "/user")

public class UserController {

    @Autowired
    private UserService userService;

@GetMapping("/index")
    public String index()
    {
        return  "1234";
    }
    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addUser(User user){
        return userService.addUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return userService.findAllUser(pageNum,pageSize);
    }
}