package com.id.controller;

import com.id.entity.User;
import com.id.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * @author HP
 * @data 2020-12-09
 */
@RestController
@RequestMapping(value = "/user", method={RequestMethod.GET, RequestMethod.POST})
@EnableAutoConfiguration
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    //注册功能，保存数据
    public String createUser(String nickname, String username, String password, String password_2){
        if(password.equals(password_2) && userService.createUser(nickname, username, password)) {
            return "<script>" +
                    "alert('注册成功！');" +
                    "location.href='/login.html';" +
                    "</script>";
        }
        return "<script>" +
                "alert('注册失败！');" +
                "location.href='/createUser.html';" +
                "</script>";
    }
    @PostMapping("/loginUser")
    //登录功能
    public String loginUser(ModelMap modelMap , String username, String password ){
        User user = userService.loginUser(username, password);
        if(user != null){
            //成功
            modelMap.put("user",user);
            return "<script>" +
                    "alert('登录成功！');" +
                    "location.href='/home.html';" +
                    "</script>";
        }
        return "<script>" +
                "alert('登录失败！');" +
                "location.href='/login.html';" +
                "</script>";
    }
}