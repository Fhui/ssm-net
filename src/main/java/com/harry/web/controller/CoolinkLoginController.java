package com.harry.web.controller;

import com.harry.base.ApiResponse;
import com.harry.entity.CoolinkUser;
import com.harry.service.impl.CoolinkLoginServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/coolink")
public class CoolinkLoginController {

    @Resource
    private CoolinkLoginServiceImpl service;

    @RequestMapping(value = "/login.action", method = RequestMethod.POST)
    @ResponseBody
    public ApiResponse<CoolinkUser> login(@RequestBody CoolinkUser user) {
        CoolinkUser coolinkUser = service.getCoolinkUser(user);
        ApiResponse<CoolinkUser> apiResponse = new ApiResponse<CoolinkUser>();
        if (null == coolinkUser) {
            apiResponse.setCode(1001);
            apiResponse.setMsg("用户名或密码错误");
            return apiResponse;
        }
        if (!user.getUserPwd().equals(coolinkUser.getUserPwd())) {
            apiResponse.setCode(1003);
            apiResponse.setMsg("用户名或密码错误");
            return apiResponse;
        }
        apiResponse.setCode(0);
        apiResponse.setMsg("success");
        apiResponse.setData(coolinkUser);
        return apiResponse;
    }
}
