package com.nfsq.yqf.automikosjta.controller;

import com.nfsq.yqf.automikosjta.bean.User;
import com.nfsq.yqf.automikosjta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qfyu
 * Date:2018/12/28
 * Time:14:24
 **/
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/insert")
    public String insert(){
        User user = new User();
        user.setPassword("43843");
        user.setUserName("tangsen");
        boolean seccess = userService.insertIntoTest1AndTest2(user);
        if(seccess){
            return "插入成功";
        }
        return "插入失败";
    }
}
