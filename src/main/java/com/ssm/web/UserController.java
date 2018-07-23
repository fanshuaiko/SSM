package com.ssm.web;

import com.ssm.model.User;
import com.ssm.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/UserController")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;
    @GetMapping("/insert")
    public String insert(String name){
        User user = new User(1,name,20,new Date());
        userServiceImpl.insert(user);
        return "success";
    }
}
