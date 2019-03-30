package com.merit.controller;

import com.merit.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {
    @RequestMapping("/getUser")
    public User getUser() {
        User u = new User();
        u.setName("张三");
        u.setAge(15);
        u.setBirthday(new Date());
        u.setPassword("");
        u.setDesc("如果为空则不显示");
        return u;
    }
}
