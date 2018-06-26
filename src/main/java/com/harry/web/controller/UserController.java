package com.harry.web.controller;

import com.harry.entity.User;
import com.harry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/getUser.action", method = RequestMethod.POST)
    @ResponseBody
    public String getJson() {
        User user = new User();
        user.setId(10);
        User user1 = service.getUser(user);
        System.out.println(user1);
        return user1.toString();
    }

}
