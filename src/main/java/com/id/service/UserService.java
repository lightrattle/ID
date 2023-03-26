package com.id.service;

import com.id.entity.User;
import com.id.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceImpl {
    @Autowired
    UserMapper userMapper;

    @Override
    public User loginUser (String username, String password){
        return userMapper.loginUser(username, password);
    }

    @Override
    public boolean createUser (String nickname, String username, String password){
        return userMapper.createUser(nickname, username, password);
    }
}
