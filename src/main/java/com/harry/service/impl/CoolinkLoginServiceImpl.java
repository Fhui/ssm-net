package com.harry.service.impl;

import com.harry.entity.CoolinkUser;
import com.harry.mapper.CoolinkUserMapper;
import com.harry.service.CoolinkLoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CoolinkLoginServiceImpl implements CoolinkLoginService {

    @Resource
    private CoolinkUserMapper mapper;

    public CoolinkUser getCoolinkUser(CoolinkUser user) {
        return mapper.getUserForId(user);
    }
}
