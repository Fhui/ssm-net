package com.harry.service.impl;

import com.harry.entity.User;
import com.harry.mapper.UserMapper;
import com.harry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * create by harry on 2018/6/26
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;


    public User getUser(User user) {
        return mapper.getUser(user);
    }
}
