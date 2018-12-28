package com.nfsq.yqf.automikosjta.service.impl;

import com.nfsq.yqf.automikosjta.bean.User;
import com.nfsq.yqf.automikosjta.mapper.test01.UserMapper1;
import com.nfsq.yqf.automikosjta.mapper.test02.UserMapper2;
import com.nfsq.yqf.automikosjta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by qfyu
 * Date:2018/12/28
 * Time:14:19
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper1 userMapper1;

    @Autowired
    UserMapper2 userMapper2;

    @Override
    @Transactional(rollbackFor = Exception.class)
    /**
     * 加了事务的注解异常不能去捕捉，事务只有在抛出异常以后才会去回滚，
     * 事务默认回滚的是uncheck异常即包括runtimexception和其子类
     * @Transactional(rollbackFor = Exception.class)表示抛出exception的异常都会回滚
     */
    public boolean insertIntoTest1AndTest2(User user) {
        int i = userMapper1.insertUser(user);
        try {
            i=i/0;
        }catch (Exception e){
           e.printStackTrace();
        }
        userMapper2.insertUser(user);
        return true;

    }
}
